public class User {
    private MqService mqService;
    private String name;

    public User(MqService mqService, String name) {
        this.mqService = mqService;
        this.name = name;
    }

    public void send(String message) {
        System.out.println(name + " sends: " + message);
        mqService.sendMessage(message, this);
    }

    public void receive(String message) {
        System.out.println(name + " receives: " + message);
    }
}
