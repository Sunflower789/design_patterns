/**
 * 指令类 -- 打开
 * */
public class TurnOn implements Command{

    private LightExecutor lightExecutor;

    public TurnOn(LightExecutor lightExecutor) {
        this.lightExecutor = lightExecutor;
    }

    public void execute() {
        lightExecutor.turnOn();
    }
}
