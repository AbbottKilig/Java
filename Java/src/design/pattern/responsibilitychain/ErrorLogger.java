package design.pattern.responsibilitychain;

public class ErrorLogger extends AbstractLogger {

	public ErrorLogger(int level) {
		super(level);
	}

	@Override
	void write(String message) {
		System.err.println("console error stdout:" + message);
	}

}
