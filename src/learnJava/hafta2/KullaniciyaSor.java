package learnJava.hafta2;

import java.util.Scanner;

public class KullaniciyaSor {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sayi;
		boolean calistir = true;
		
		while (calistir) {
			System.out.println("Yapmak istadi�iniz i�lemi se�iniz:");
			System.out.println("   1.Faktoriyel al.");
			System.out.println("   2.Say�ya kadar olan tek say�lar� yazd�r.");
			System.out.println("   3.�IKI�");
			int secim = scanner.nextInt();
			switch (secim) {
			case 1:
				System.out.println("Bir say� giriniz.");
				sayi = scanner.nextInt();
				int sonuc=1;
				for (int i = 1; i <= sayi; i++) {
					sonuc=sonuc*i;
				}
				System.out.println("Sonu�:"+sonuc);
			
				break;
			case 2:
				System.out.println("Bir say� giriniz.");
				sayi = scanner.nextInt();
				for (int i = 1; i <= sayi; i+=2) {
						System.out.println(i);	
				}
				break;
			case 3:
				calistir = false;
				break;

			default:
				System.out.println("Hatal� bir i�lem yapt�n�z l�tfen tekrar deneyiniz.");
				break;
			}
			System.out.println("---------------------------------");
		}
		scanner.close();
	}

}
