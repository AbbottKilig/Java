package design.pattern.decorate;

public class Monkey implements Hero {

	@Override
	public void hit() {
		System.out.println("monkey is killing...");
	}

}
