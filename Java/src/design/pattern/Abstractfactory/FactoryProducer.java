package design.pattern.Abstractfactory;

public class FactoryProducer  {

	 public AbstractFactory getFactory(String type) {
		 if ("txt".equalsIgnoreCase(type)) {
			return new FileUtilsFactory();
		}
		 if ("db".equalsIgnoreCase(type)) {
			return new DBUtilsFactory();
		}
		 return null;
	 }

}
