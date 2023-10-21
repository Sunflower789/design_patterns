public class ObserverExample {
    public static void main(String[] args) {
        WeatherSubject weatherSubject = new WeatherSubject();
        TvStationObserver tvStationObserver = new TvStationObserver();
        OceanObserver oceanObserver = new OceanObserver();
        weatherSubject.registerObserver(tvStationObserver);
        weatherSubject.registerObserver(oceanObserver);
        weatherSubject.setTemperature("27°C");
        weatherSubject.notifyObservers();

        System.out.println("----------");

        oceanObserver.show();
        tvStationObserver.show();

    }
}
