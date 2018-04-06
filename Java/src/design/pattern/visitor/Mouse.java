package design.pattern.visitor;

public class Mouse implements ComputerComponent {

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}


}
