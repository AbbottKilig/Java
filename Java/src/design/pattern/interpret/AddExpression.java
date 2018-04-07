package design.pattern.interpret;

public class AddExpression implements Expression {

	private Expression a;
	private Expression b;
	
	public AddExpression(Expression a, Expression b) {
		this.a = a;
		this.b = b;
	}
	@Override
	public double interpret(String context) {
		String[] split = context.split(" ");
		return a.interpret(split[0]) + b.interpret(split[1]); 

	}

}
