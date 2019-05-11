package examples.For;

import java.util.Scanner;

public class for03 {
	public static void main(String[] args) {
		/*
		 Ekran Çýktýsý: 
		 
		 ****
		 ***
		 **
		 *
		 **
		 ***
		 ****
		 
		 */ 
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bir sayý giriniz.");
		int sayi = scanner.nextInt();

		for (int i = sayi; i >0; i--) {
			System.out.println();
			if (i%3!=0) {
				for (int j = 0; j < i; j++) {
					System.out.print("*");
				}	
			}	
		}
		for (int i = 0; i <=sayi; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}	
			System.out.println();
		}
	
		scanner.close();
	}

}
