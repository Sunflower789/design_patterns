package buildSelf;
/**
 * 抽象建造者
 * */
public interface CarBuild {
    CarBuild door(String door);
    CarBuild window(String window);
    CarBuild avnt(String avnt);
    Car build();
}
