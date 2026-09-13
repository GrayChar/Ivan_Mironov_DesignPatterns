package builder;

public class Product {

    private String name;
    private double price;
    private String category;

    private Product(Builder builder) {
        this.name = builder.name;
        this.price = builder.price;
        this.category = builder.category;
    }

    @Override
    public String toString() {
        return name + ", " + price + " руб., " + category;
    }

    public static class Builder {

        private String name;
        private double price;
        private String category;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setPrice(double price) {
            this.price = price;
            return this;
        }

        public Builder setCategory(String category) {
            this.category = category;
            return this;
        }

        public Product build() {
            return new Product(this);
        }
    }
}
