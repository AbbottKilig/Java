package design.pattern.visitor;

public class Monitor implements ComputerComponent {

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}


}
