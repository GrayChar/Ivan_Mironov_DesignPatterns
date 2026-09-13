package decorator;

public class Delivery extends ProductDecorator {

    public Delivery(Product product) {
        super(product);
    }

    @Override
    public String getDescription() {
        return product.getDescription() + " + доставка";
    }

    @Override
    public double getPrice() {
        return product.getPrice() + 300;
    }
}
