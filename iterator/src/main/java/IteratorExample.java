public class IteratorExample {
    public static void main(String[] args) {
        String[] colors = {"Red", "Green", "Blue", "Yellow"};
        MyCollection collection = new MyConcreteCollection(colors);
        MyIterator iterator = collection.createIterator();

        while (iterator.hasNext()) {
            String color = (String) iterator.next();
            System.out.println("Color: " + color);
        }
    }
}
