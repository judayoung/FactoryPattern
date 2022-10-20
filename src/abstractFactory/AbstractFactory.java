package abstractFactory;

public interface AbstractFactory {

    String deco = "logo ";

    String createShirts();
    String createJean();
    String createSneakers();

    int getTotalPrice();

    String getStyle();
}
