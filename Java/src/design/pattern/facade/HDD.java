package design.pattern.facade;

public class HDD extends Hardware {

	@Override
	public void electrify() {
		System.out.println("hdd in charging...");
	}

	@Override
	public void outage() {
		System.out.println("hdd interrupt the power...");
	}

}
