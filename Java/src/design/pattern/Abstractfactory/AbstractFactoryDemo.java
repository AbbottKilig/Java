package design.pattern.Abstractfactory;

public class AbstractFactoryDemo {

	public static void main(String[] args) {
		
		FactoryProducer fp = new FactoryProducer();
		AbstractFactory factory = fp.getFactory("db");
		DBUtils dbUtils = factory.getDBUtils("mysql");
		dbUtils.getConnection();
		factory = fp.getFactory("txt");
		FileUtils fileUtils = factory.getFileUtils("csv");
		fileUtils.getConnection();
		
		
	}

}
