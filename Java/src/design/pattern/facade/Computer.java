package design.pattern.facade;

public class Computer {

	private Hardware cpu;
	private Hardware memory;
	private Hardware hdd;
	
	public Computer() {
		cpu = new CPU();
		memory = new Memory();
		hdd = new HDD();
	}
	
	public void electrify() {
		cpu.electrify();
		hdd.electrify();
		memory.electrify();
	}
	
	public void outage() {
		cpu.outage();
		memory.outage();
		hdd.outage();
	}
}
