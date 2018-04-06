package design.pattern.visitor;

public interface Visitor {

	public void visit(Keyward keyward);

	public void visit(Mouse mouse);

	public void visit(Monitor monitor);

	public void visit(Computer computer);

}
