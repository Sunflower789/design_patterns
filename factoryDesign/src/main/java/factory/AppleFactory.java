package factory;

public class AppleFactory implements Factory {
    public Phone createPhone() {
        return new ApplePhone();
    }
}
