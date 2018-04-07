package design.pattern.Bridge;

public class Square extends Shape {

	private int x,y,radius;
	protected Square(int x, int y, int radius, DrawAPI drawAPI) {
		super(drawAPI);
		this.x = x;
		this.y = y;
		this.radius = radius;
		
	}

	@Override
	public void draw() {
		drawAPI.drawPosition(x, y);
		System.out.println("circle radius:" + radius);
	}

}
