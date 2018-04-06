package design.pattern.facade;

public class FacadePatternDemo {

	public static void main(String[] args) {
		Computer computer = new Computer();
		computer.electrify();
		computer.outage();
	}
}
