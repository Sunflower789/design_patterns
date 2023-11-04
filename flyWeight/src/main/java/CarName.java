/**
 * 具体享元
 * */
public class CarName implements Text{
    private String key;
    private String value;

    public CarName(String key) {
        this.key = key;
        this.value = key + "car";
    }

    public String getText() {
        return value;
    }
}
