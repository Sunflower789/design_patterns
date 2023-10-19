

import java.math.BigDecimal;

public class OrderContext {
    private BigDecimal total;
    private PaymentStrategy paymentStrategy;

    public void orderPay(){
        paymentStrategy.pay();
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public PaymentStrategy getPaymentStrategy() {
        return paymentStrategy;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public OrderContext() {
    }

    public OrderContext(BigDecimal total, PaymentStrategy paymentStrategy) {
        this.total = total;
        this.paymentStrategy = paymentStrategy;
    }
}
