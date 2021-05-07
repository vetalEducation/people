public class TestPeople {
	public static void main(String[] args) {
		John john = new John("Smith");
		Liam liam = new Liam("Scott");
		
		john.moveBack();
		john.moveForward();
		john.moveLeft();
		john.moveRight();
		
		System.out.println("***");
		
		liam.moveBack();
		liam.moveForward();
		liam.moveLeft();
		liam.moveRight();
	}
}