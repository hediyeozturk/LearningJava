package examples.Metod;

import java.util.Scanner;

import learnJava.hafta1.Carpim;

public class DortIslem {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("1. Toplama");
		System.out.println("2. Çýkarma");
		System.out.println("3. Çarpma");
		System.out.println("4. Bölme");

		System.out.print("Bir seçim yapýnýz\t=\t");
		int secim = scanner.nextInt();

		System.out.println("1. Sayýyý giriniz\t=\t");
		int sayi1 = scanner.nextInt();

		System.out.println("2. Sayýyý giriniz\t=\t");
		int sayi2 = scanner.nextInt();

		switch (secim) {
		case 1:
			System.out.println("Toplam = " + Topla(sayi1, sayi2));
			break;
		case 2:
			System.out.println("Fark = " + Cikar(sayi1, sayi2));
			break;
		case 3:

			System.out.println("Çarpým = " + Carp(sayi1, sayi2));
			break;
		case 4:
			System.out.println("Bölme = " + Bol(sayi1, sayi2));
			break;
		default:
			break;
		}
		scanner.close();
	}

	public static int Topla(int sayi1, int sayi2) {
		int toplam = sayi1 + sayi2;
		return toplam;

	}

	public static int Cikar(int sayi1, int sayi2) {
		int fark = sayi1 - sayi2;
		return fark;
	}

	private static int Carp(int sayi1, int sayi2) {
		int carpim = sayi1 * sayi2;
		return carpim;
	}
	
	private static float Bol(int sayi1, int sayi2) {
		float bolme = sayi1 / (float) sayi2;
		return bolme;
	}

}
