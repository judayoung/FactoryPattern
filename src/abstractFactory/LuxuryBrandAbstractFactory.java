package abstractFactory;

import product.Product;

import java.util.ArrayList;

public class LuxuryBrandAbstractFactory implements AbstractFactory {

    private String bbbDeco = "bird " + AbstractFactory.deco;

    private String aaaColor = "white ";
    private String aaaDeco = "V " + AbstractFactory.deco;
    private Product shirts;
    private Product jean;
    private Product sneakers;

    public LuxuryBrandAbstractFactory(Product shirts, Product jean, Product sneakers) {
        this.shirts = shirts;
        this.jean = jean;
        this.sneakers = sneakers;
    }

    @Override
    public String createShirts() {
        return bbbDeco + shirts.getName();
    }

    @Override
    public String createJean() {
        return aaaColor + jean.getName();
    }

    @Override
    public String createSneakers() {
        return aaaDeco + sneakers.getName();
    }

    @Override
    public int getTotalPrice() {
        return shirts.getPrice() + jean.getPrice() + sneakers.getPrice();
    }

    public ArrayList<Product> getProductList(){
        ArrayList<Product> productList = new ArrayList<>();
        productList.add(shirts);
        productList.add(jean);
        productList.add(sneakers);
        return productList;
    }

    public String getStyle(){
        StringBuilder style = new StringBuilder();
        ArrayList<Product> productList = getProductList();
        for(Product product: productList){
            style.append(product.getName() + "\n");
        }
        return String.valueOf(style);
    }
}
