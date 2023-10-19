public class CoffeeDrink extends DrinkTemplate {
    @Override
    void brew() {
        System.out.println("Pouring coffee into cup");
    }

    @Override
    void others() {
        System.out.println("pouring sugar or milk");
    }
}
