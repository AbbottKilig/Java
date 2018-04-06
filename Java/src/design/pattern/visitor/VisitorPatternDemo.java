package design.pattern.visitor;

public class VisitorPatternDemo {
	
	public static void main(String[] args) {
		ComputerComponent component = new Computer();
		component.accept(new Teacher());
	}

}
