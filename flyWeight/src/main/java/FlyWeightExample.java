public class FlyWeightExample {
    public static void main(String[] args) {
        TextFactory textFactory = new TextFactory();
        String a1 = textFactory.getText("AA").getText();
        String a2 = textFactory.getText("AA").getText();
        String a3 = textFactory.getText("AB").getText();
        String a4 = new CarName("AA").getText();
        if(a1 == a2){
            System.out.println("a1 == a2");
        }
        if(a1.equals(a2)){
            System.out.println("a1.equals(a2)");
        }
        if(a1 == a4){
            System.out.println("a1 == a4");
        }
        if(a1.equals(a4)){
            System.out.println("a1.equals(a4)");
        }
    }
}
