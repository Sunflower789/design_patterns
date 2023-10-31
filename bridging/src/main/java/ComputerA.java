public class ComputerA implements Computer{
    private Cpu cpu;
    private Memory memory;

    public ComputerA(Cpu cpu, Memory memory) {
        this.cpu = cpu;
        this.memory = memory;
    }

    public void display() {
        System.out.println("create ComputerA with ");
        cpu.display();
        System.out.println(" and ");
        memory.display();
    }
}
