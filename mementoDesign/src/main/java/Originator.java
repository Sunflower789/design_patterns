/**
 * 发起者
 * */
public class Originator {
    private String state;

    public Originator() {
    }

    public Originator(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    //新增状态，创建备忘录
    public Memento create() {
        return new Memento(state);
    }

    //回滚状态
    public void restore(Memento memento) {
        state = memento.getState();
    }
}
