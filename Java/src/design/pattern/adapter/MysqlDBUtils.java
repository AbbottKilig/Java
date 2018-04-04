package design.pattern.adapter;

public class MysqlDBUtils implements DBUtils {

	@Override
	public void getConnection() {
		System.out.println("get mysql connection...");
	}

	@Override
	public void getData(String id) {
		System.out.println("get data by id in mysql");
	}

}
