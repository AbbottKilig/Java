package design.pattern.state;

public class Computer {

	private State state;
	public void setState(State State) {
		this.state = state;
	}

	
	public State getState() {
		return state;
	}
}
