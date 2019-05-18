package examples.Metod;

public class Overload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] dizi = {7,11,19,17};

		float diziSonuc = ortalamaAl(dizi);
		float sayilarSonuc = ortalamaAl(6, 3);

		System.out.println("dizi ortalamasý: " + diziSonuc);
		System.out.println("iki sayi ortalamasý: " + sayilarSonuc);
	}

	private static float ortalamaAl(float sayi1, float sayi2) {
		return (sayi1 + sayi2) / 2;
	}
	
	private static float ortalamaAl(int[] dizi) {
		float toplam = 0;
		for (int i : dizi) {
			toplam += i;
		}
		return toplam / dizi.length;
	}



}
