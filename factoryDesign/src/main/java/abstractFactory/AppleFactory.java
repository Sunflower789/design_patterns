package abstractFactory;

public class AppleFactory implements Factory {
    public Phone createPhone() {
        return new ApplePhone();
    }

    public Computer createComputer() {
        return new AppleComputer();
    }
}
