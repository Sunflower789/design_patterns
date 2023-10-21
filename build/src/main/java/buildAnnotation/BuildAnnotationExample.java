package buildAnnotation;

public class BuildAnnotationExample {
    public static void main(String[] args) {
        Car.CarBuilder carBuilder = Car.builder();
        carBuilder.door("door1");
        carBuilder.window("window1");
        carBuilder.avnt("avnt1");
        Car car = carBuilder.build();

        System.out.println("car: " + car);
    }
}
