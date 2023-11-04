public class VisitorExample {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(2.0);
        Square square = new Square();
        square.setSide(4.0);

        AreaCalculator areaCalculator = new AreaCalculator();
        areaCalculator.calcute(circle);
        areaCalculator.calcute(square);

        PerimeterCalculator perimeterCalculator = new PerimeterCalculator();
        perimeterCalculator.calcute(circle);
        perimeterCalculator.calcute(square);
    }
}
