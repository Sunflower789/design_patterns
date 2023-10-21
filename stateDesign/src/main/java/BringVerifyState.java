public class BringVerifyState implements State{
    public String bringVerify() {
        return "the order is bringVerify success";
    }

    public String shipped() {
        return "error: the order should bringVerify first";
    }

    public String completed() {
        return "error: the order should bringVerify first";
    }
}
