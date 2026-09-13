package strategy;

public class Main {
    public static void main(String[] args) {

        Shop shop = new Shop(new CardPayment());
        shop.buy(1500);

        shop = new Shop(new CashPayment());
        shop.buy(2000);
    }
}
