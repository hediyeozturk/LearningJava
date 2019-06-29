package learnJava.hafta6.exceptions;

public class MyException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int hataKodu;
	String hataMesaji;
	
	public MyException(int hataKodu, String hataMesaji) {
		this.hataKodu = hataKodu;
		this.hataMesaji = hataMesaji;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String str = String.format("Hata Kodu = %d\nHata Mesaji = %s", hataKodu, hataMesaji);
		return str;
	}
}
