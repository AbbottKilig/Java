package design.pattern.Abstractfactory;

public class FileUtilsFactory extends AbstractFactory {

	@Override
	FileUtils getFileUtils(String type) {
		if ("txt".equalsIgnoreCase(type)) {
			return new TXTFileUtils();
		}
		if ("csv".equalsIgnoreCase(type)) {
			return new CSVFileUtils();
		}
		return null;
	}

	@Override
	DBUtils getDBUtils(String type) {
		return null;
	}

}
