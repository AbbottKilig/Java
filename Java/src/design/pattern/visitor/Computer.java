package design.pattern.visitor;

public class Computer implements ComputerComponent {

	ComputerComponent[] part = new ComputerComponent[] {
			new Monitor(),
			new Mouse(),
			new Keyward()
	};
	@Override
	public void accept(Visitor visitor) {
		for (int i = 0; i < part.length; i++) {
			part[i].accept(visitor);
		}
		visitor.visit(this);
	}


}
