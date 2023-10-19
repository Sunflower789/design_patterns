package lazy;

/**
 * 懒汉式：
 * 存在线程安全问题。多个线程访问公共获取方法存在并发问题
 * */
public class SingletonLazy1 {
    private static SingletonLazy1 instance;

    //私有构造函数，防止外部实例化
    private SingletonLazy1() {
    }

    public static SingletonLazy1 getInstance() {
        if (instance == null) {
            instance = new SingletonLazy1();
        }
        return instance;
    }
}
