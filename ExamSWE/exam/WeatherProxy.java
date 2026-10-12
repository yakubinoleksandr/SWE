package exam;

public class WeatherProxy implements WeatherService {
    private RealWeatherService realService;
    private String cachedData;
    private long lastUpdate;
    private static final long CACHE_DURATION = 5000;

    public WeatherProxy() {
        this.realService = new RealWeatherService();
    }

    @Override
    public String getWeatherData() {
        long currentTime = System.currentTimeMillis();

        if (cachedData == null || (currentTime - lastUpdate) > CACHE_DURATION) {
            System.out.println("[Proxy] Дані застаріли або відсутні. Оновлюємо кеш...");
            cachedData = realService.getWeatherData();
            lastUpdate = currentTime;
        } else {
            System.out.println("[Proxy] Повертаємо дані з кешу (актуальні ще "
                    + (CACHE_DURATION - (currentTime - lastUpdate)) + " мс)");
        }
        return cachedData;
    }
}
