import java.util.ArrayList;
import java.util.List;

/**
 * 复合类
 * */
public class Composite extends Component{

    private List<Component> children = new ArrayList<Component>();

    public Composite(String name) {
        super(name);
    }

    public void add(Component component) {
        children.add(component);
    }

    public void remove(Component component) {
        children.remove(component);
    }

    @Override
    public void operation() {
        System.out.println("Composite " + name);
        for (Component child : children) {
            child.operation();
        }
    }
}
