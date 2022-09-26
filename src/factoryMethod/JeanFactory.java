package factoryMethod;

public class JeanFactory implements Factory{
    @Override
    public String createItem() {
        return "blue Jean ";
    }
}
