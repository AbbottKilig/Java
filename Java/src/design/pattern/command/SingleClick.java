package design.pattern.command;

public class SingleClick implements Click {

	private Action action;
	public SingleClick(Action action) {
		this.action = action;
	}
	@Override
	public void execute() {
		action.action();
	}

}
