package design.pattern.memento;

public class MementoPatternDemo {

public static void main(String[] args) {
	Originator originator = new Originator();
    originator.setState("State #1");
    originator.setState("State #2");
    originator.saveStateToMemento();
    originator.setState("State #3");
    originator.saveStateToMemento();
    originator.setState("State #4");
    originator.saveStateToMemento();

    System.out.println("Current State: " + originator.getState(2));        
    System.out.println("First saved State: " + originator.getState(0));
    System.out.println("Second saved State: " + originator.getState(1));
}
}
