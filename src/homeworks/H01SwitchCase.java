package homeworks;

import java.util.Scanner;

public class H01SwitchCase {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1.Sayýyý giriniz.");
		int sayi1 = scanner.nextInt();

		System.out.println("2.Sayýyý giriniz.");
		int sayi2 = scanner.nextInt();

		System.out.println("1.(x+y)^2");
		System.out.println("2.(x+y)^3");
		System.out.println("3.(x-y)^2");
		System.out.println("4.(x-y)^3");
		System.out.println("Yapmak istediðiniz iþlemi seçiniz.");
		int secim = scanner.nextInt();
		double sonuc = -1;
		switch (secim) {
		case 1:
			sonuc = Math.pow((sayi1 + sayi2), 2);
			break;
		case 2:
			sonuc = Math.pow((sayi1 + sayi2), 3);
			break;
		case 3:
			sonuc = Math.pow((sayi1 - sayi2), 2);
			break;
		case 4:
			sonuc = Math.pow((sayi1 - sayi2), 3);
			break;
		default:
			System.out.println("Hatalý bir seçim yaptýnýz.");
			break;
		}

		System.out.println("Ýþlem sonucu: " + sonuc);

		int mod7 = (int) sonuc % 7;
		String Gun;
		switch (mod7) {
		case 1:
			Gun = "Pazartesi";
			break;
		case 2:
			Gun = "Salý";
			break;
		case 3:
			Gun = "Çarþamba";
			break;
		case 4:
			Gun = "Perþembe";
			break;
		case 5:
			Gun = "Cuma";
			break;
		case 6:
			Gun = "Cumartesi";
			break;
		case 0:
			Gun = "Pazar";
			break;
		default:
			Gun = "Hatalý Bir Ýþlem Yaptýnýz.";
			break;
		}

		System.out.println("Karþýlýk gelen gün :" + Gun);
		scanner.close();
	}

}
