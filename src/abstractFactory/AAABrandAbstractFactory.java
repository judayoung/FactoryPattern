package abstractFactory;

public class AAABrandAbstractFactory implements AbstractFactory {

    private String aaaColor = "white ";
    private String aaaDeco = "V " + AbstractFactory.deco;

    @Override
    public String createShirts() {
        return aaaColor + "Shirts ";
    }

    @Override
    public String createJean() {
        return aaaColor + AbstractFactory.super.createJean();
    }

    @Override
    public String createSneakers() {
        return aaaDeco + AbstractFactory.super.createSneakers();
    }

}
