package design.pattern.facade;

public class CPU extends Hardware {

	@Override
	public void electrify() {
		System.out.println("CUP in charging...");
	}

	@Override
	public void outage() {
		System.out.println("CUP interrupt the power...");
	}

}
