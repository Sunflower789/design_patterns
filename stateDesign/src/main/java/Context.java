/**
 * 上下文类
 * */
public class Context {
    private State state;

    public Context(State state) {
        this.state = state;
    }

    public void bringVerify(){
        System.out.println(state.bringVerify());
    }

    public void ship(){
        System.out.println(state.shipped());
    }

    public void complete(){
        System.out.println(state.completed());
    }
}
