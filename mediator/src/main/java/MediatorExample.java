public class MediatorExample {
    public static void main(String[] args) {
        MqService mqService = new MqService();
        User user1 = new User(mqService,"u1");
        User user2 = new User(mqService,"u2");
        User user3 = new User(mqService,"u3");
        mqService.addUser(user1);
        mqService.addUser(user2);
        mqService.addUser(user3);

        user1.send("hello!");
    }
}
