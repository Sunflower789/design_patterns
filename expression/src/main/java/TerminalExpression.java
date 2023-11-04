/**
 * 具体表达式
 * */
public class TerminalExpression implements Expression{

    private String keyword;

    public TerminalExpression(String keyword) {
        this.keyword = keyword;
    }

    public boolean interpret(String context) {
        return context.contains(keyword);
    }
}
