package design.pattern.state;

public class StatePatternDemo {

	public static void main(String[] args) {
		Computer computer = new Computer();
		PerformState performState = new PerformState();
		performState.execute(computer);
		System.out.println(computer.getState());
		
		OutageState outageState = new OutageState();
		outageState.execute(computer);
		System.out.println(computer.getState());
	}
}
