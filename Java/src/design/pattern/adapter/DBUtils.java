package design.pattern.adapter;

public interface DBUtils {
	
	public abstract void getConnection();
	public abstract void getData(String id);
}
