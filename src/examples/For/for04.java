package examples.For;

import java.util.Scanner;

public class for04 {

	public static void main(String[] args) {
		// Faktoriyel
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bir sayý giriniz.");
		int sayi = scanner.nextInt();
		int sonuc=1;
		for (int i = 1; i <= sayi; i++) {
			sonuc=sonuc*i;
		}
		
		System.out.println(sonuc);
		scanner.close();
	}

}
