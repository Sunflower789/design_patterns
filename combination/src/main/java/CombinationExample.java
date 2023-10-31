public class CombinationExample {
    public static void main(String[] args) {
        Leaf leaf1 = new Leaf("leaf1");
        Leaf leaf2 = new Leaf("leaf2");
        Leaf leaf3 = new Leaf("leaf3");

        Composite composite = new Composite("Composite");
        composite.add(leaf1);
        composite.add(leaf2);
        composite.add(leaf3);

        composite.operation();
    }
}
