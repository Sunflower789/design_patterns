package factory;

public class FactoryExample {
    public static void main(String[] args) {
        // 这里可以切换工厂
        Factory phoneFactory = new AppleFactory();
        Phone applePhone = phoneFactory.createPhone();
        applePhone.createPhone();
    }
}
