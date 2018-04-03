package design.pattern.Abstractfactory;

public class TXTFileUtils implements FileUtils {

	@Override
	public void getConnection() {
		System.out.println("get txt file...");
	}

}
