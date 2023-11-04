public class Square implements Shape{
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void accept(Calculator calculator) {
        calculator.calcute(this);
    }
}
