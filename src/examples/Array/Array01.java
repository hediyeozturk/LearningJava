package examples.Array;

import java.util.Scanner;

public class Array01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Sýnýfýnýzda kaç öðrenci var?");
		int elemanSayisi = scanner.nextInt();
		int[] yasDizisi = new int[elemanSayisi];
		int toplam = 0;

		for (int i = 0; i < elemanSayisi; i++) {
			System.out.println(i + 1 + ". öðrencinin yaþýný giriniz:");
			int yas = scanner.nextInt();
			yasDizisi[i] = yas;
			toplam += yas;
		}

		System.out.println("Toplam Yaþ : " + toplam);

		System.out.println("Kaçýncý elemanýn yaþýný görmek istersiniz?");
		int secilenEleman=scanner.nextInt();
		System.out.println(secilenEleman+ ". elemanýn yaþý : " + yasDizisi[secilenEleman-1]);
		
		scanner.close();
	}
}
