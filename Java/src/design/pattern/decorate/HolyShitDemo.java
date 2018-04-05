package design.pattern.decorate;

public class HolyShitDemo {
	public static void main(String[] args) {
		HolyShit holyShit = new HolyShit(new Monkey());
		holyShit.hit();
	}

}
