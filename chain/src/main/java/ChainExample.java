public class ChainExample {
    public static void main(String[] args) {
        HandlerContex handlerContex = new HandlerContex();
        handlerContex.addHandler(new OrderHandler());
        handlerContex.addHandler(new PayHandler());
        handlerContex.addHandler(new CompleteHandler());

        handlerContex.process();

        System.out.println("---------");
        HandlerContex handlerContex1 = new HandlerContex();
        handlerContex1.addHandler(new CompleteHandler());
        handlerContex1.addHandler(new OrderHandler());
        handlerContex1.addHandler(new PayHandler());

        handlerContex1.process();
    }
}
