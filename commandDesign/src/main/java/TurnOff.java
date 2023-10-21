/**
 * 指令类 -- 关闭
 * */
public class TurnOff implements Command{

    private LightExecutor lightExecutor;

    public TurnOff(LightExecutor lightExecutor) {
        this.lightExecutor = lightExecutor;
    }

    public void execute() {
        lightExecutor.turnOff();
    }
}
