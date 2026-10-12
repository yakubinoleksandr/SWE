package exam;

class PhoneDisplay implements Observer {
    private String name;

    public PhoneDisplay(String name) { this.name = name; }

    @Override
    public void update(float temp, float hum) {
        System.out.println("Повідомлення для " + name + ": Температура " + temp + "°C, Вологість " + hum + "%");
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("=== Тестування Observer ===");
        WeatherStation station = new WeatherStation();
        PhoneDisplay iPhone = new PhoneDisplay("iPhone 15");
        PhoneDisplay android = new PhoneDisplay("Samsung S23");

        station.registerObserver(iPhone);
        station.registerObserver(android);

        station.setMeasurements(25.5f, 60.0f);
        station.setMeasurements(27.2f, 55.0f);

        System.out.println("\n=== Тестування Proxy ===");
        WeatherService weatherProxy = new WeatherProxy();
        System.out.println("Запит 1: " + weatherProxy.getWeatherData());

        Thread.sleep(2000);
        System.out.println("Запит 2: " + weatherProxy.getWeatherData());

        Thread.sleep(4000);
        System.out.println("Запит 3: " + weatherProxy.getWeatherData());
    }
}
