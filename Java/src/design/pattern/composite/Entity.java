package design.pattern.composite;

public abstract class Entity {

	private String id;
	
	public Entity(String id) {
		this.id = id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return id;
	}
}
