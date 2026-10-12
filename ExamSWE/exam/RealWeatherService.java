package exam;

public class RealWeatherService implements WeatherService {
    @Override
    public String getWeatherData() {
        System.out.println("--- Запит до реального сервера погоди... ---");
        return "Температура: +22°C, Сонячно";
    }
}