public class CompletedState implements State{
    public String bringVerify() {
        return "err: the order is already bringVerify, don't repeat";
    }

    public String shipped() {
        return "err: the order is already shipped, don't repeat";
    }

    public String completed() {
        return "the order is completed success";
    }
}
