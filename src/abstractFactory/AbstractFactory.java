package abstractFactory;

public interface AbstractFactory {

    String deco = "logo ";

    String createShirts();
    default String createJean(){
        return "Jean ";
    }
    default String createSneakers(){
        return "blue Sneakers ";
    }

}
