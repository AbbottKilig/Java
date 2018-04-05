package design.pattern.decorate;

public class HolyShit implements Hero {

	private Hero hero;
	
	public HolyShit(Hero hero) {
		this.hero = hero;
	}

	@Override
	public void hit() {
		hero.hit();
		System.out.println("holy shit...");
	}

}
