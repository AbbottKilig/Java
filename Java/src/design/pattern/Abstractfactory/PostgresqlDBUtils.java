package design.pattern.Abstractfactory;

public class PostgresqlDBUtils implements DBUtils {

	@Override
	public void getConnection() {
		System.out.println("get postgresql DBUtils...");
	}
	
}
