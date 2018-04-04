package design.pattern.prototype;

public abstract class DBUtils implements Cloneable{
	public String type;
	
	abstract void getConnection();
	public String getType() {
		return type;
	}
	
	public Object clone() {
		Object object = null;
		
		try {
			object = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return object;
	}
}
