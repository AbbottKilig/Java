package design.pattern.factory;

public class MysqlDBUtils implements DBUtils {

	@Override
	public void getConnection() {
		System.out.println("get mysql DBUtils...");

	}

}
