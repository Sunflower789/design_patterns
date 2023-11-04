/**
 * 外观接口类
 * */
public class Computer {
    private Cpu cpu;
    private Memory memory;

    public Computer(Cpu cpu, Memory memory) {
        this.cpu = cpu;
        this.memory = memory;
    }

    public void start(){
        System.out.println("start computer!");
        cpu.load();
        memory.load();
        System.out.println("computer started!");
    }
}
