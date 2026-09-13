package proxy;

public class Main {
    public static void main(String[] args) {

        OrderService order = new OrderServiceProxy(true);
        order.getOrder();

        order = new OrderServiceProxy(false);
        order.getOrder();
    }
}
