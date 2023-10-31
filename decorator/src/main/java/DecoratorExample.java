public class DecoratorExample {
    public static void main(String[] args) {
        Beverage coke = new Coke();
        System.out.println(coke.getDescription());

        Beverage sugarCoke = new SugarDecorator(coke);
        System.out.println(sugarCoke.getDescription());

    }
}
