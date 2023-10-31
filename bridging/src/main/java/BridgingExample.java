public class BridgingExample {
    public static void main(String[] args) {
        IntelCpu intelCpu = new IntelCpu();
        KingstonMemory kingstonMemory = new KingstonMemory();
        ComputerA computerA = new ComputerA(intelCpu,kingstonMemory);
        computerA.display();
    }
}
