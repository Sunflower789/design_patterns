/**
 * 模板方法：定义一个抽象模板类，抽取相同的方法和步骤，将不同的方法写成抽象方法由子类去实现
 * */
abstract class DrinkTemplate {

    /**
     * 模板方法，定义了整个制备饮料的算法骨架 (通常是用final修饰的)
     * */
    public final void makeDrink(){
        boilWater();
        brew();
        others();
    }

    /**
     * 煮水是相同的步骤
     * */
    private void boilWater() {
        System.out.println("Boiling water");
    }

    /**
     * 冲泡的步骤在具体子类中实现
     * */
    abstract void brew();

    /**
     * 其它步骤
     * */
    abstract void others();
}
