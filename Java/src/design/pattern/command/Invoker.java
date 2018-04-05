package design.pattern.command;

import java.util.HashSet;
import java.util.Set;

public class Invoker {
	private Set<Click> clicks;
	public Invoker() {
		this.clicks = new HashSet<Click>();
	}
	public void addClick(Click click) {
		this.clicks.add(click);
	}
	
	public void execute() {
		for (Click click : clicks) {
			click.execute();
		}
	}

}
