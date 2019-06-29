package learnJava.hafta6.exceptions;

public class CarpimClass {
	public int Hesapla(int sayi1, int sayi2) throws MyException {

			if (sayi1 == 0 || sayi2 == 0) {
				throw new MyException(0, "0 yutan eleman");
			}
			int sonuc = sayi1 * sayi2;
			return sonuc;

	}
}
