package examples.Array;

import java.util.Scanner;

public class Array01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("S�n�f�n�zda ka� ��renci var?");
		int elemanSayisi = scanner.nextInt();
		int[] yasDizisi = new int[elemanSayisi];
		int toplam = 0;

		for (int i = 0; i < elemanSayisi; i++) {
			System.out.println(i + 1 + ". ��rencinin ya��n� giriniz:");
			int yas = scanner.nextInt();
			yasDizisi[i] = yas;
			toplam += yas;
		}

		System.out.println("Toplam Ya� : " + toplam);

		System.out.println("Ka��nc� eleman�n ya��n� g�rmek istersiniz?");
		int secilenEleman=scanner.nextInt();
		System.out.println(secilenEleman+ ". eleman�n ya�� : " + yasDizisi[secilenEleman-1]);
		
		scanner.close();
	}
}
