package design.pattern.template;

public abstract class Hero {

	public abstract void hit();
	public abstract void back();
	public abstract void go();
	
	public final void play() {
		go();
		hit();
		back();
	}
}
