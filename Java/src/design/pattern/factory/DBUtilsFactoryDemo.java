package design.pattern.factory;

public class DBUtilsFactoryDemo {

	public static void main(String[] args) {
		DBUtilsFactory df = new DBUtilsFactory();
		DBUtils utils = null;
		utils = df.getDBUtils("mysql");
		utils.getConnection();
		utils = df.getDBUtils("postgresql");
		utils.getConnection();
		utils = df.getDBUtils("oracle");
		utils.getConnection();

	}

}
