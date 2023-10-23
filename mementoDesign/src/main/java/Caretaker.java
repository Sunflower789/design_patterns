import java.util.ArrayList;
import java.util.List;

/**
 * 管理者
 * */
public class Caretaker {

    private List<Memento> mementos = new ArrayList<Memento>();

    public void push(Memento memento) {
        mementos.add(memento);
    }

    public Memento pop() {
        int lastIndex = mementos.size() - 1;
        Memento memento = mementos.get(lastIndex);
        mementos.remove(lastIndex);
        return memento;
    }
}
