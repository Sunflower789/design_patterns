package buildSelf;

public class BuildSelfExample {
    public static void main(String[] args) {
        Car car = Car.carBuild
                .door("door2")
                .window("window2")
                .avnt("avnt2")
                .build();

        System.out.println("car: " + car);
    }
}
