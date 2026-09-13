package proxy;

public class OrderServiceProxy implements OrderService {

    private RealOrderService realService = new RealOrderService();
    private boolean authorized;

    public OrderServiceProxy(boolean authorized) {
        this.authorized = authorized;
    }

    @Override
    public void getOrder() {
        if (authorized) {
            realService.getOrder();
        } else {
            System.out.println("Доступ запрещён");
        }
    }
}
