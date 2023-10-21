public class TvStationObserver implements Observer{

    private String temperature;

    public void receive(String temperature) {
        this.temperature = temperature;
    }

    public void show() {
        System.out.println("TvStation receive temperature : " + temperature);
    }
}
