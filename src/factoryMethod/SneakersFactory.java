package factoryMethod;

public class SneakersFactory implements Factory{

    @Override
    public String createItem() {
        return "white Sneakers ";
    }
}
