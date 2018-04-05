package design.pattern.template;

public class Monkey extends Hero {

	@Override
	public void hit() {
		System.out.println("hit and run");
	}

	@Override
	public void back() {
		System.out.println("go home");
	}

	@Override
	public void go() {
		System.out.println("acceleratily go forword...");
	}

}
