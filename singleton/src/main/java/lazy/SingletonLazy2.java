package lazy;
/**
 * 懒汉式:
 * 在公共获取单例对象的方法上加上synchronized锁。就不会有线程安全的问题。
 * 但是有个问题，实例化一般只会进行一次，绝大多数场景都是读，这样会造成额外的不必要开销。
 * */
public class SingletonLazy2 {

    private static SingletonLazy2 instance;

    //私有构造函数，防止外部实例化
    private SingletonLazy2() {
    }

    public static synchronized SingletonLazy2 getInstance() {
        if (instance == null) {
            instance = new SingletonLazy2();
        }
        return instance;
    }
}
