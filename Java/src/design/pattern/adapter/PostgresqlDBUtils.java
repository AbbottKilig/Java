package design.pattern.adapter;

public class PostgresqlDBUtils implements DBUtils{

	@Override
	public void getConnection() {
		System.out.println("get postgresql connection...");
	}

	@Override
	public void getData(String id) {
		System.out.println("get data by id in postgresql");
	}

}
