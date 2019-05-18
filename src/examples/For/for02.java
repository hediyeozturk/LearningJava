package examples.For;

import java.util.Scanner;

public class for02 {
	/* Dýþardan alýnan sayýya kadar arttýrýp tek sayýlarý ekrana yazdýrma */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bir sayý giriniz.");
		int sayi = scanner.nextInt();
		System.out.println("---------------------------------");
		for (int i = 1; i <= sayi; i+=2) {
				System.out.println(i);	
		}
		scanner.close();
	}
}
