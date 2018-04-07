package design.pattern.Bridge;

public class Circle extends Shape {

	private int x,y;
	protected Circle(int x, int y, DrawAPI drawAPI) {
		super(drawAPI);
		this.x = x;
		this.y = y;
		
	}

	@Override
	public void draw() {
		drawAPI.drawPosition(x, y);
		System.out.println("square");
	}

}
