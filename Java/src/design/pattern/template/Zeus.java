package design.pattern.template;

public class Zeus extends Hero {

	@Override
	public void hit() {
		System.out.println("global attack...");
	}

	@Override
	public void back() {
		System.out.println("go back home until died...");
	}

	@Override
	public void go() {
		System.out.println("flying ...");
	}

}
