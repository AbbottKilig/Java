package design.pattern.command;

public class DoubleClick implements Click {

	private Action action;
	public DoubleClick(Action action) {
		this.action = action;
	}
	@Override
	public void execute() {
		action.action();
	}

}
