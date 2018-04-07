package design.pattern.interpret;

public class TerminalExpression implements Expression {

	
	public TerminalExpression() {
	}		
	@Override
	public double interpret(String context) {
		return Double.parseDouble(context);

	}

}
