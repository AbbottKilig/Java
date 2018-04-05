package design.pattern.mediator;

public class Monitor {
	
	public static void broadcastMessage(Teacher teacher, String message) {
		System.out.println(teacher + ":" + message);
	}

}
