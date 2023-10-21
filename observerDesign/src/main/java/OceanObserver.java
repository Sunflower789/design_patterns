public class OceanObserver implements Observer{

    private String temperature;

    public void receive(String temperature) {
        this.temperature = temperature;
    }

    public void show() {
        System.out.println("ocean receive temperature : " + temperature);
    }


}
