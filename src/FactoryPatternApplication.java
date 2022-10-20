import abstractFactory.CheapBrandAbstractFactory;
import abstractFactory.AbstractFactory;
import abstractFactory.LuxuryBrandAbstractFactory;
import factoryMethod.Factory;
import factoryMethod.JeanFactory;
import factoryMethod.ShirtsFactory;
import factoryMethod.SneakersFactory;
import product.Jean;
import product.Shirts;
import product.Sneakers;

import java.util.ArrayList;

public class FactoryPatternApplication {

    private static Factory shirtFactory = new ShirtsFactory(new Jean(49900));
    private static Factory jeanFactory = new JeanFactory(new Shirts(39900));
    private static Factory sneakersFactory = new SneakersFactory(new Sneakers(55000));

    private static AbstractFactory cheapAbstractFactory = new CheapBrandAbstractFactory(new Shirts(50),new Jean(10), new Sneakers(30));
    private static AbstractFactory luxuryAbstractFactory = new LuxuryBrandAbstractFactory(new Shirts(100000), new Jean(200000), new Sneakers(600000));

    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Get Ready With Me!\n");

        System.out.println("...Factory Methods pattern");
        ArrayList<Factory> factoryList = getFactoryList();

        String styleOfFactoryMethod = getStyle(factoryList);
        System.out.println(styleOfFactoryMethod);
        System.out.println("total price : " + getTotal(factoryList)+"\n");

        System.out.println("...Abstract Factory pattern : AAA");
        String styleOfAbstractFactory = cheapAbstractFactory.getStyle();
        System.out.println(styleOfAbstractFactory);
        System.out.println("total price : " + cheapAbstractFactory.getTotalPrice()+"\n");

        System.out.println("...Abstract Factory pattern : BBB");
        styleOfAbstractFactory = luxuryAbstractFactory.getStyle();
        System.out.println(styleOfAbstractFactory);
        System.out.println("total price : " + luxuryAbstractFactory.getTotalPrice()+"\n");

    }

    public static ArrayList<Factory> getFactoryList(){
        ArrayList<Factory> factoryList = new ArrayList<>();
        factoryList.add(shirtFactory);
        factoryList.add(jeanFactory);
        factoryList.add(sneakersFactory);
        return factoryList;
    }

    public static String getStyle(ArrayList<Factory> factoryList){
        StringBuilder style = new StringBuilder();
        for(Factory factory: factoryList){
            style.append(factory.createProduct() + "\n");
        }
        return String.valueOf(style);
    }

    public static int getTotal(ArrayList<Factory> factoryList){
        int total = 0;
        for(Factory factory: factoryList){
            total += factory.getProductPrice();
        }
        return total;
    }

}
