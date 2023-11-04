public class PerimeterCalculator implements Calculator{
    public void calcute(Circle circle) {
        double perimeter = 3.1415 * 2 * circle.getRadius();
        System.out.println("the perimeter of circle is " + perimeter);
    }

    public void calcute(Square square) {
        double perimeter = 4 * square.getSide();
        System.out.println("the perimeter of square is " + perimeter);
    }
}
