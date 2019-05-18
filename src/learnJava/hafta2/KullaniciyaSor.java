package learnJava.hafta2;

import java.util.Scanner;

public class KullaniciyaSor {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sayi;
		boolean calistir = true;
		
		while (calistir) {
			System.out.println("Yapmak istadiðiniz iþlemi seçiniz:");
			System.out.println("   1.Faktoriyel al.");
			System.out.println("   2.Sayýya kadar olan tek sayýlarý yazdýr.");
			System.out.println("   3.ÇIKIÞ");
			int secim = scanner.nextInt();
			switch (secim) {
			case 1:
				System.out.println("Bir sayý giriniz.");
				sayi = scanner.nextInt();
				int sonuc=1;
				for (int i = 1; i <= sayi; i++) {
					sonuc=sonuc*i;
				}
				System.out.println("Sonuç:"+sonuc);
			
				break;
			case 2:
				System.out.println("Bir sayý giriniz.");
				sayi = scanner.nextInt();
				for (int i = 1; i <= sayi; i+=2) {
						System.out.println(i);	
				}
				break;
			case 3:
				calistir = false;
				break;

			default:
				System.out.println("Hatalý bir iþlem yaptýnýz lütfen tekrar deneyiniz.");
				break;
			}
			System.out.println("---------------------------------");
		}
		scanner.close();
	}

}
