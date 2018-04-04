package design.pattern.prototype;

public class MysqlDBUtils extends DBUtils {

	public MysqlDBUtils() {
		type = "mysql";
	}
	@Override
	void getConnection() {

		System.out.println("get mysql connection...");
	}
	

}
