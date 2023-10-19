public class TeaDrink extends DrinkTemplate {
    @Override
    void brew() {
        System.out.println("Pouring tea into cup");
    }

    @Override
    void others() {
        System.out.println("none or pouring sugar");
    }
}
