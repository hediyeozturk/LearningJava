package examples.For;

import java.util.Scanner;

public class for01 {
	/* D��ardan al�nan say�ya kadar artt�r�p ekrana yazd�rma */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bir say� giriniz.");
		int sayi = scanner.nextInt();
		System.out.println("---------------------------------");
		for (int i = 1; i <= sayi; i++) {
			System.out.println(i);
		}
		scanner.close();

	}
}
