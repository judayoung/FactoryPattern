import abstractFactory.AAABrandAbstractFactory;
import abstractFactory.AbstractFactory;
import abstractFactory.BBBBrandAbstractFactory;
import factoryMethod.Factory;
import factoryMethod.JeanFactory;
import factoryMethod.ShirtsFactory;
import factoryMethod.SneakersFactory;

public class FactoryPatternApplication {

    private static Factory shirtFactory = new ShirtsFactory();
    private static Factory jeanFactory = new JeanFactory();
    private static Factory sneakersFactory = new SneakersFactory();

    private static AbstractFactory aaaAbstractFactory = new AAABrandAbstractFactory();
    private static AbstractFactory bbbAbstractFactory = new BBBBrandAbstractFactory();

    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Get Ready With Me!");

        StringBuilder factoryMethodStyle = new StringBuilder();
        factoryMethodStyle.append(shirtFactory.createItem())
                .append(jeanFactory.createItem())
                .append(sneakersFactory.createItem());
        System.out.println("factoryMethodStyle : " + factoryMethodStyle);

        StringBuilder aaaAbstractFactoryStyle = new StringBuilder();
        aaaAbstractFactoryStyle
                .append(aaaAbstractFactory.createShirts())
                .append(aaaAbstractFactory.createJean())
                .append(aaaAbstractFactory.createSneakers());
        System.out.println("aaaAbstractFactoryStyle : "+aaaAbstractFactoryStyle);

        StringBuilder bbbAbstractFactoryStyle = new StringBuilder();
        bbbAbstractFactoryStyle
                .append(bbbAbstractFactory.createShirts())
                .append(bbbAbstractFactory.createJean())
                .append(bbbAbstractFactory.createSneakers());
        System.out.println("bbbAbstractFactoryStyle : "+bbbAbstractFactoryStyle);

    }

}
