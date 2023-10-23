public class MementoExample {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("state 1");
        Memento memento1 = originator.create();
        caretaker.push(memento1);
        System.out.println("the state of originator is : " + originator.getState());

        originator.setState("state 2");
        Memento memento2 = originator.create();
        caretaker.push(memento2);
        System.out.println("the state of originator is : " + originator.getState());

        originator.restore(caretaker.pop());
        System.out.println("the state of originator is : " + originator.getState());

        originator.restore(caretaker.pop());
        System.out.println("the state of originator is : " + originator.getState());
    }
}
