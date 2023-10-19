package lazy;
/**
 * 利用内部静态类创建单例：
 * 利用JVM加载外部类的过程中是不会加载静态内部类的。只有静态内部类的属性或方法被调用时才会被加载并初始化。
 * 静态属性由于被final修饰，所以能保证只被实例化一次。
 *
 * 此种方法没有额外性能开销，是一种不错的创建单例的方法。
 * */
public class SingletonLazy4 {
    private SingletonLazy4 instance;

    //私有构造函数，防止外部实例化
    private SingletonLazy4() {
    }

    //定义一个静态内部类，类内部定义一个静态常量
    private static class SingletonInner{
        private static final SingletonLazy4 SINGLETON_LAZY = new SingletonLazy4();
    }

    public static SingletonLazy4 getInstance(){
        return SingletonInner.SINGLETON_LAZY;
    }
}
