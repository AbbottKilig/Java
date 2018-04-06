package design.pattern.visitor;

public class Keyward implements ComputerComponent {

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}


}
