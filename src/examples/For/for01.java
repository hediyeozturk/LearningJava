package examples.For;

import java.util.Scanner;

public class for01 {
	/* Dýþardan alýnan sayýya kadar arttýrýp ekrana yazdýrma */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bir sayý giriniz.");
		int sayi = scanner.nextInt();
		System.out.println("---------------------------------");
		for (int i = 1; i <= sayi; i++) {
			System.out.println(i);
		}
		scanner.close();

	}
}
