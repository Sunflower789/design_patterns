import lombok.AllArgsConstructor;
import lombok.Data;


import java.util.Map;

/**
 * 原型接口就是  Cloneable （jdk）
 * 具体原型即使  User 类
 *
 * 通过运行示例可以看得出来是重写clone方法是实现了深拷贝
 * 其实原型设计模式最需要考虑的便是  深浅拷贝的引用的问题
 * */
@Data
@AllArgsConstructor
public class User implements Cloneable {
    private String name;
    private Map<String,String> infos;
    private Car car;

    public User() {
        System.out.println("crate a new user by construct");
    }

    @Override
    protected User clone() throws CloneNotSupportedException {
        return (User)super.clone();
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", infos=" + infos +
                ", car=" + car +
                '}';
    }
}
