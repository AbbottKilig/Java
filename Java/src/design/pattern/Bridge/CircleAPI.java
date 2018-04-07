package design.pattern.Bridge;

public class CircleAPI implements DrawAPI{

	@Override
	public void drawPosition(int x, int y) {

		System.out.println("position: x:" + x/2 + "y:" + y/2);
	}

}
