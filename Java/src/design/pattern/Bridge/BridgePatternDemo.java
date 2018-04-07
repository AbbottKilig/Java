package design.pattern.Bridge;

public class BridgePatternDemo {
	
	public static void main(String[] args) {
		Shape circle = new Square(0, 0, 0,new CircleAPI());
		Shape square = new Circle(0, 0, new SquareAPI());
		
		circle.draw();
		square.draw();
	}

}
