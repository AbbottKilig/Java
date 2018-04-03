package design.pattern.Abstractfactory;

public abstract class AbstractFactory {
	abstract FileUtils getFileUtils(String type);
	abstract DBUtils getDBUtils(String type);
}
