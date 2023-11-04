public class FacadeExample {
    public static void main(String[] args) {
        Computer computer = new Computer(new Cpu(),new Memory());
        computer.start();
    }
}
