package design.pattern.responsibilitychain;

public class ConsoleLogger extends AbstractLogger {

	public ConsoleLogger(int level) {
		super(level);
	}

	@Override
	void write(String message) {
		System.out.println("console stdout:"+message);
	}

}
