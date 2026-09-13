package decorator;

public class BasicProduct implements Product {

    @Override
    public String getDescription() {
        return "Товар";
    }

    @Override
    public double getPrice() {
        return 1000;
    }
}
