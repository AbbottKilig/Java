package design.pattern.responsibilitychain;

public class FileLogger extends AbstractLogger {

	public FileLogger(int level) {
		super(level);
	}

	@Override
	void write(String message) {
		System.out.println("File stdout:" + message);
	}

}
