package hunger;

/**
 *  饿汉式单例设计：
 *  启动时便创建了单例对象
 *  实现方式--私有静态成员+私有静态构造+公有静态获取实例方法
 * */
public class SingletonHunger {
    private static SingletonHunger singletonHunger = new SingletonHunger();

    //私有化构造，防止外部实例化
    private SingletonHunger(){}

    public static SingletonHunger getInstance(){
        return singletonHunger;
    }
}
