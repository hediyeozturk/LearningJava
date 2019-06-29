package learnJava.hafta5.elektronik;

public class Marka {
	long id;
	String adi;
	byte[] logo;
	
	@Override
	public String toString() {
		return id + " " + adi;
	}
}
