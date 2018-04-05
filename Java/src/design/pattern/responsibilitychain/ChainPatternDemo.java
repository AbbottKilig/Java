package design.pattern.responsibilitychain;

public class ChainPatternDemo {

	public static void main(String[] args) {
		AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
		ErrorLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
		FileLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
		
		consoleLogger.setNextLogger(errorLogger);
		errorLogger.setNextLogger(fileLogger);
		
		consoleLogger.logMessage(3, "this is a message");
		
	}
}
