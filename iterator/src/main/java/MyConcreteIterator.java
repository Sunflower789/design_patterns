/**
 * 具体迭代器类
 * */
public class MyConcreteIterator implements MyIterator{

    private String[] collection;
    private int position = 0;

    public MyConcreteIterator(String[] collection) {
        this.collection = collection;
    }

    public boolean hasNext() {
        return position < collection.length;
    }

    public Object next() {
        if (hasNext()) {
            String element = collection[position];
            position++;
            return element;
        }
        return null;
    }
}
