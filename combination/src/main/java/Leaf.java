/**
 * 叶子类
 * */
public class Leaf extends Component{

    public Leaf(String name) {
        super(name);
    }

    @Override
    public void operation() {
        System.out.println("Leaf " + name);
    }
}
