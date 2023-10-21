package abstractFactory;

public class AbstractFactoryExample {
    public static void main(String[] args) {
        // 这里可以切换工厂
        Factory factory = new AppleFactory();
        Phone phone = factory.createPhone();
        Computer computer = factory.createComputer();

        phone.createPhone();
        computer.createComputer();
    }

}
