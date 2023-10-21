package abstractFactory;

public class HuaweiFactory implements Factory {
    public Phone createPhone() {
        return new HuaweiPhone();
    }

    public Computer createComputer() {
        return new HuaweiComputer();
    }
}
