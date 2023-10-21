import java.util.HashMap;
import java.util.Map;

public class PrototypeExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        User user = new User();
        user.setName("张三");
        Map<String,String> infos = new HashMap<String, String>(2);
        infos.put("age","30");
        infos.put("weigh","60kg");
        user.setInfos(infos);
        Car car = new Car("A01","A01-001");
        user.setCar(car);

        User user1 = user.clone();
        user1.setName("李四");
        user1.getCar().setModel("A01-002");
        user1.getInfos().put("age","31");
        System.out.println("use: " + user.toString());
        System.out.println("use1: " + user1.toString());
    }
}
