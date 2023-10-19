/**
 * 模板模式分为 抽象父类/模板类（DrinkTemplate）和 具体实现类（TeaDrink、CoffeeDrink）
 * */
public class TemplateMethodExample {
    public static void main(String[] args) {
        TeaDrink teaDrink = new TeaDrink();
        teaDrink.makeDrink();
        System.out.println("----------");
        CoffeeDrink coffeeDrink = new CoffeeDrink();
        coffeeDrink.makeDrink();
    }
}
