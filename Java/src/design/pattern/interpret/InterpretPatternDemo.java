package design.pattern.interpret;

public class InterpretPatternDemo {
	
	public static void main(String[] args) {
		Expression expression = new TerminalExpression();
		Expression addExpression = new AddExpression(expression, expression);
		Expression subExpression = new SubExpression(expression, expression);
		System.out.println(addExpression.interpret("10 5"));
		System.out.println(subExpression.interpret("10 5"));
	}

}
