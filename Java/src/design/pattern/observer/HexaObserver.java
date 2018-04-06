package design.pattern.observer;

public class HexaObserver extends Observer {

	public HexaObserver(Subject subject) {
		super(subject);
	}

	 @Override
	   public void update() {
	      System.out.println( "Hex String: " 
	      + Integer.toHexString( subject.getState() ).toUpperCase() ); 
	   }
}
