package abstractFactory;

public class BBBBrandAbstractFactory implements AbstractFactory {

    private String bbbDeco = "bird " + AbstractFactory.deco;

    @Override
    public String createShirts() {
        return bbbDeco + "Shirts ";
    }

    @Override
    public String createJean() {
        return bbbDeco + AbstractFactory.super.createJean();
    }

    @Override
    public String createSneakers() {
        return bbbDeco + AbstractFactory.super.createSneakers();
    }
}
