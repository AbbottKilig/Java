package design.pattern.Abstractfactory;

public class CSVFileUtils implements FileUtils{

	@Override
	public void getConnection() {
		System.out.println("get CSV file...");
	}

}
