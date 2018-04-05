package design.pattern.template;

public class TemplatePatternDemo {
	public static void main(String[] args) {
		Hero monkey = new Monkey();
		monkey.play();
		Hero zeus = new Zeus();
		zeus.play();
	}

}
