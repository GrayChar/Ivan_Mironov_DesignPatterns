package decorator;

public class Main {
    public static void main(String[] args) {

        Product product = new BasicProduct();

        product = new GiftWrap(product);
        product = new Delivery(product);

        System.out.println(product.getDescription());
        System.out.println("Цена: " + product.getPrice());
    }
}
