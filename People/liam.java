public class Liam {
	public final long IDcode = (long) (Math.random * 40_000_000);
	private String surname;

	public Liam(String surname) {
		this.surname = surname;
	}	

	public long getSurname() {
		return surname;
	}
	
	@Override
	public String toString() {
		return "Liam {" + "IDcode = " + IDcode + ", surname = " + surname + '}';
	}
}