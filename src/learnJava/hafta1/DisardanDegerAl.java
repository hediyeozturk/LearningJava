package learnJava.hafta1;

import java.util.Scanner;

public class DisardanDegerAl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("L�tfen 1. Say�y� giriniz :  ");
		int sayi1 = scanner.nextInt();
		System.out.print("L�tfen 2. Say�y� giriniz :  ");
		int sayi2 = scanner.nextInt();
		int carpim = sayi1 * sayi2;

		System.out.println(sayi1 + " x " + sayi2 + " = " + carpim);
		scanner.close();
	}

}
