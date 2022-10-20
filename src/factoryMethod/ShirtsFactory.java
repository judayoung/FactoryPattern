package factoryMethod;

import product.Product;

public class ShirtsFactory implements Factory {
    private Product product;

    public ShirtsFactory(Product product) {
        this.product = product;
    }

    @Override
    public String createProduct() {
        return "green "+product.getName();
    }

    @Override
    public int getProductPrice() {
        return product.getPrice();
    }
}
