package design.pattern.mediator;

public class MediatorDemo {

	public static void main(String[] args) {
		Teacher chinese = new Teacher("chinese");
		chinese.notice("homework");
		Teacher english = new Teacher("English");
		english.notice("spoken english");
	}
}
