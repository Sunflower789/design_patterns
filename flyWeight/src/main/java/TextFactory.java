import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂
 * */
public class TextFactory {
    private Map<String, Text> map = new HashMap<String, Text>();

    public Text getText(String key) {
        if (!map.containsKey(key)) {
            map.put(key, new CarName(key));
            System.out.println(map);
        }
        return map.get(key);
    }

}
