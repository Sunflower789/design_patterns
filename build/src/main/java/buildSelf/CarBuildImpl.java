package buildSelf;
/**
 * 具体建造者
 * */
public class CarBuildImpl implements CarBuild{
    private String door;
    private String window;
    private String avnt;

    public CarBuild door(String door) {
        this.door = door;
        return this;
    }

    public CarBuild window(String window) {
        this.window = window;
        return this;
    }

    public CarBuild avnt(String avnt) {
        this.avnt = avnt;
        return this;
    }

    public Car build() {
        return new Car(door,window,avnt);
    }
}
