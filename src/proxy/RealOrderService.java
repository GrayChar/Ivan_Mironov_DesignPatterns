package proxy;

public class RealOrderService implements OrderService {

    @Override
    public void getOrder() {
        System.out.println("Заказ получен");
    }
}
