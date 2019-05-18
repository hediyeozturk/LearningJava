package learnJava.hafta1;

import java.util.Scanner;

public class DisardanDegerAl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen 1. Sayýyý giriniz :  ");
		int sayi1 = scanner.nextInt();
		System.out.print("Lütfen 2. Sayýyý giriniz :  ");
		int sayi2 = scanner.nextInt();
		int carpim = sayi1 * sayi2;

		System.out.println(sayi1 + " x " + sayi2 + " = " + carpim);
		scanner.close();
	}

}
