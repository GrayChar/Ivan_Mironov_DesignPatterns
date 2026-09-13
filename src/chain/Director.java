package chain;

public class Director extends OrderHandler {

    @Override
    public void handle(int amount) {
        System.out.println("Директор одобрил заказ на " + amount);
    }
}
