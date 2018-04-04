package design.pattern.prototype;

public class PostgresqlDBUtils extends DBUtils {

	public PostgresqlDBUtils() {
		type = "postgresql";
	}
	@Override
	void getConnection() {

		System.out.println("get postgresql connection...");
	}
	

}
