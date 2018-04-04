package design.pattern.adapter;

public interface FileUtils {

	public abstract void getConnection();
	public abstract void getData(String type,String id);
}
