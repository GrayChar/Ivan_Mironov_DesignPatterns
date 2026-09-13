package chain;

public class Boss extends OrderHandler {

    @Override
    public void handle(int amount) {
        if (amount <= 50000) {
            System.out.println("Начальник одобрил заказ на " + amount);
        } else if (next != null) {
            next.handle(amount);
        }
    }
}
