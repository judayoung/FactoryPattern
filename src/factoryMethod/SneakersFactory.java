package factoryMethod;

import product.Product;

public class SneakersFactory implements Factory {


    private Product product;

    public SneakersFactory(Product product) {
        this.product = product;
    }

    @Override
    public String createProduct() {
        return "white " + product.getName();
    }

    @Override
    public int getProductPrice() {
        return product.getPrice();
    }
}
