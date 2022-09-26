package factoryMethod;

public class ShirtsFactory implements Factory {
    @Override
    public String createItem() {
        return "green Shirts ";
    }
}
