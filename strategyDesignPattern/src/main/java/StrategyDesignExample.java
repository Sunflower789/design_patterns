import java.math.BigDecimal;

public class StrategyDesignExample {
    public static void main(String[] args) {
        OrderContext orderContext = new OrderContext(new BigDecimal("10"),new WetChatPay());
        orderContext.orderPay();
        System.out.println("----------");
        OrderContext orderContext1 = new OrderContext(new BigDecimal("11"),new Alipay());
        orderContext1.orderPay();
    }
}
