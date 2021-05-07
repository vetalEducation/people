public class John {
	public final long IDcode = (long) (Math.random * 40_000_000);
	private String surname;

	public John(String surname) {
		this.surname = surname;
	}	

	public long getSurname() {
		return surname;
	}
	
	@Override
	public String toString() {
		return "John {" + "IDcode = " + IDcode + ", surname = " + surname + '}';
	}
}