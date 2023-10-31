/**
 * 装饰器具体类
 * */
public class IceDecorator extends Decorator{

    public IceDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Ice";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.0;
    }
}
