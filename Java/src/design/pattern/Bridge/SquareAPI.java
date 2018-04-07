package design.pattern.Bridge;

public class SquareAPI implements DrawAPI{

	@Override
	public void drawPosition(int x, int y) {

		System.out.println("position: x:" + x + "y:" + y);
	}

}
