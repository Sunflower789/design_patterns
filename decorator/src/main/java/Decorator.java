/**
 * 装饰器抽象类
 * */
public abstract class Decorator extends Beverage{
    protected Beverage beverage;

    public Decorator(Beverage beverage) {
        this.beverage = beverage;
    }

}
