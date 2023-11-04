public class Circle implements Shape{
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void accept(Calculator calculator) {
        calculator.calcute(this);
    }
}
