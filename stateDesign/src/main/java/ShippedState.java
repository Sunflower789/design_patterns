public class ShippedState implements State{
    public String bringVerify() {
        return "err: the order is already bringVerify, don't repeat";
    }

    public String shipped() {
        return "the order is shipped success";
    }

    public String completed() {
        return "error: the order should shipped first";
    }
}
