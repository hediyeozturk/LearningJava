package examples.For;

import java.util.Scanner;

public class for02 {
	/* D��ardan al�nan say�ya kadar artt�r�p tek say�lar� ekrana yazd�rma */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bir say� giriniz.");
		int sayi = scanner.nextInt();
		System.out.println("---------------------------------");
		for (int i = 1; i <= sayi; i+=2) {
				System.out.println(i);	
		}
		scanner.close();
	}
}
