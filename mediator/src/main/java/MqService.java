import java.util.ArrayList;
import java.util.List;

public class MqService {
    private List<User> users = new ArrayList<User>();

    public void addUser(User user) {
        users.add(user);
    }

    public void sendMessage(String message, User user) {
        for (User u : users) {
            if (u != user) {
                u.receive(message);
            }
        }
    }
}
