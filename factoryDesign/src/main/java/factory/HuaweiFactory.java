package factory;

public class HuaweiFactory implements Factory {
    public Phone createPhone() {
        return new HuaweiPhone();
    }
}
