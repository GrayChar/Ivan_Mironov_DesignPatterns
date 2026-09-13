package decorator;

public class GiftWrap extends ProductDecorator {

    public GiftWrap(Product product) {
        super(product);
    }

    @Override
    public String getDescription() {
        return product.getDescription() + " + подарочная упаковка";
    }

    @Override
    public double getPrice() {
        return product.getPrice() + 200;
    }
}
