package builder;

public class Main {
    public static void main(String[] args) {

        Product product = new Product.Builder()
                .setName("Ноутбук")
                .setPrice(80000)
                .setCategory("Электроника")
                .build();

        System.out.println(product);
    }
}
