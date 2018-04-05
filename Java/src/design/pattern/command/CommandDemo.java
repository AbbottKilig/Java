package design.pattern.command;

public class CommandDemo {
	public static void main(String[] args) {
		Invoker invoker = new Invoker();
		invoker.addClick(new SingleClick(new SingleAction()));
		invoker.addClick(new DoubleClick(new DoubleAction()));
		invoker.addClick(new SingleClick(new DoubleAction()));
		invoker.execute();
	}

}
