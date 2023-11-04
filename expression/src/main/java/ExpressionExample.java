public class ExpressionExample {
    public static void main(String[] args) {
        Expression expression1 = new TerminalExpression("day");
        Expression expression2 = new TerminalExpression("nice");
        String context1 = "Today is a good day!";
        Expression expression3 = new AndExpression(expression1,expression2);
        Expression expression4 = new OrExpression(expression1,expression2);
        System.out.println(expression3.interpret(context1));
        System.out.println(expression4.interpret(context1));
    }
}
