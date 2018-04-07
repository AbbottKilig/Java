package design.pattern.state;

public class PerformState implements State {

	@Override
	public void execute(Computer computer) {
		System.out.println("computer is running...");
		computer.setState(this);
	}
	
	@Override
	public String toString() {
		return "running";
	}

}
