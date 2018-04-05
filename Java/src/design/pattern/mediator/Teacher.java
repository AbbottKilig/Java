package design.pattern.mediator;

public class Teacher {
	
	private String id;

	public Teacher(String id) {
		this.id = id;
	}
	
	public void notice(String message) {
		Monitor.broadcastMessage(this, message);
	}
	@Override
	public String toString() {
		return "teacher:" + id + " ";
	}
	
}
