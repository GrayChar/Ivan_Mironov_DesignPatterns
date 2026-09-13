package strategy;

public class Shop {

    private PaymentStrategy paymentStrategy;

    public Shop(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void buy(double amount) {
        paymentStrategy.pay(amount);
    }
}
