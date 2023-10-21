public class CommandExample {
    public static void main(String[] args) {
        LightExecutor light = new LightExecutor();
        Command command = new TurnOn(light);
        command.execute();
    }
    
}
