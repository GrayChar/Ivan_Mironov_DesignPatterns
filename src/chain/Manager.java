package chain;

public class Manager extends OrderHandler {

    @Override
    public void handle(int amount) {
        if (amount <= 10000) {
            System.out.println("Менеджер одобрил заказ на " + amount);
        } else if (next != null) {
            next.handle(amount);
        }
    }
}
