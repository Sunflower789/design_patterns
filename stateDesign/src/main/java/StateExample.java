public class StateExample {
    public static void main(String[] args) {
        Context context = new Context(new ShippedState());
        context.ship();
        context.complete();
    }
}
