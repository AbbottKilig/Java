package design.pattern.visitor;

public interface ComputerComponent {

	public abstract void accept(Visitor visitor);
}
