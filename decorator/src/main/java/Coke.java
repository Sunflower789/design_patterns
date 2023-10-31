/**
 * 具体组件类
 * */
public class Coke extends Beverage{
    @Override
    public String getDescription() {
        return "Coke";
    }

    @Override
    public double cost() {
        return 3.0;
    }
}
