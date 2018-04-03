package design.pattern.factory;

public class OracleDBUtils implements DBUtils {

	@Override
	public void getConnection() {
		System.out.println("get oracle DBUtils...");
	}

}
