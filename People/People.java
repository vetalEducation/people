public class People {
	private PeopleFunctions functions;
	
	public People {
		functions = new PeopleFunctions();
	}
	
	public void moveBack() {
		functions.moveBack();
	}
	
	public void moveForward() {
		functions.moveForward();
	}
	
	public void moveLeft() {
		functions.moveLeft();
	}
	
	public void moveRight() {
		functions.moveRight();
	}
}