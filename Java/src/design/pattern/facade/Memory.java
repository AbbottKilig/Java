package design.pattern.facade;

public class Memory extends Hardware {

	@Override
	public void electrify() {
		System.out.println("memory in charging...");
	}

	@Override
	public void outage() {
		System.out.println("memory interrupt the power...");
	}

}
