package design.pattern.Abstractfactory;

public class MysqlDBUtils implements DBUtils {

	@Override
	public void getConnection() {
		System.out.println("get mysql DBUtils...");

	}

}
