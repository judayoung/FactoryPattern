package factoryMethod;

import product.Product;

public class JeanFactory implements Factory{

    private Product product;

    public JeanFactory(Product product) {
        this.product = product;
    }

    @Override
    public String createProduct() {
        return "blue "+product.getName();
    }

    @Override
    public int getProductPrice() {
        return product.getPrice();
    }
}
