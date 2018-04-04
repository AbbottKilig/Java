package design.pattern.adapter;

public class FileUtilsAdapter implements FileUtils {

	private DBUtils dbutils;
	
	public FileUtilsAdapter(String type) {
		if (type.equalsIgnoreCase("mysql")) {
			dbutils = new MysqlDBUtils();
			
		}
		if (type.equalsIgnoreCase("postgresql")) {
			dbutils = new PostgresqlDBUtils();
		}
	}
	
	@Override
	public void getConnection() {
		System.out.println("get file connection...");
	}

	@Override
	public void getData(String type, String id) {
		if (type.equalsIgnoreCase("mysql")) {
			dbutils.getData(id);			
		}
		if (type.equalsIgnoreCase("postgresql")) {
			dbutils.getData(id);
		}
	}


	

}
