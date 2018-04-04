package design.pattern.adapter;

public class FileUtilsCompatiable implements FileUtils{

	private FileUtilsAdapter fa;
	@Override
	public void getConnection() {
		
	}

	@Override
	public void getData(String type, String id) {
		if (type.equalsIgnoreCase("mysql")) {
			fa = new FileUtilsAdapter("mysql");
			fa.getData(type, id);
		} else
		if (type.equalsIgnoreCase("postgrqsql")) {
			fa = new FileUtilsAdapter("postgrqsql");
			fa.getData(type, id);
		}
		else {
			System.out.println("get data by id in file");
		}
		
	}

}
