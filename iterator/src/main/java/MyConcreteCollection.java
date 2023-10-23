/**
 * 具体集合类
 * */
public class MyConcreteCollection implements MyCollection{

    private String[] elements;

    public MyConcreteCollection(String[] elements) {
        this.elements = elements;
    }

    public MyIterator createIterator() {
        return new MyConcreteIterator(elements);
    }
}
