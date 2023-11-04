public class AreaCalculator implements Calculator{
    public void calcute(Circle circle) {
        double area = 3.1415 * circle.getRadius() * circle.getRadius();
        System.out.println("the area of circle is " + area);
    }

    public void calcute(Square square) {
        double area = square.getSide() * square.getSide();
        System.out.println("the area of square is " + area);
    }
}
