package design.pattern.visitor;

public class Teacher implements Visitor {

	@Override
	public void visit(Keyward keyward) {
		System.out.println("kick the keyward");
	}

	@Override
	public void visit(Mouse mouse) {
		System.out.println("move the mouse");
	}

	@Override
	public void visit(Monitor monitor) {
		System.out.println("open the monitor");
	}

	@Override
	public void visit(Computer computer) {
		System.out.println("open the computer");
	}

}
