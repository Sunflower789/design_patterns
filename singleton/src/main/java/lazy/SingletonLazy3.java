package lazy;
/**
 * 懒汉式:
 * 双重检查锁定（Double check locked）。
 * --只有在示例需要初始化时才加锁。可以防止多个线程在第一次判空后等待获取到锁从而导致创建多个实例。
 *
 * 但是，在多线程下，由于jvm存在指令重排的问题。（synchronized可以保证可见性和原子性）
 *     --这是由于 new SingletonLazy3() 这句语法在jvm中是分成三步执行的：
 *         1、分配对象内存
 *         2、调用构造方法，执行初始化
 *         3、将对象引用赋值给对象instance
 *     --按照123的顺序执行不会出问题；如果按照132执行，那么在执行到第三步的时候，如果刚好切到另一线程，
 *     --instance判断不为null直接返回，但是实际上的引用是未初始化的，直接使用会导致异常。
 * 所以还需要在instance对象前面加上 volatile 关键字，禁止指令重排。
 *
 * */
public class SingletonLazy3 {
    private static volatile SingletonLazy3 instance;

    //私有构造函数，防止外部实例化
    private SingletonLazy3() {
    }

    public static SingletonLazy3 getInstance() {
        if (instance == null) {
            synchronized (SingletonLazy3.class){
                if(instance == null){
                    instance = new SingletonLazy3();
                }
            }
        }
        return instance;
    }
}
