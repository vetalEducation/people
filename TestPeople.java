public class TestPeople {
	public static void main(String[] args) {
		John john = new John("Lennon");
		Liam liam = new Liam("Howlett");
		
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