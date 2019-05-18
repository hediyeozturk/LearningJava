package homeworks;

import java.util.Scanner;

public class H01SwitchCase {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1.Say�y� giriniz.");
		int sayi1 = scanner.nextInt();

		System.out.println("2.Say�y� giriniz.");
		int sayi2 = scanner.nextInt();

		System.out.println("1.(x+y)^2");
		System.out.println("2.(x+y)^3");
		System.out.println("3.(x-y)^2");
		System.out.println("4.(x-y)^3");
		System.out.println("Yapmak istedi�iniz i�lemi se�iniz.");
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
			System.out.println("Hatal� bir se�im yapt�n�z.");
			break;
		}

		System.out.println("��lem sonucu: " + sonuc);

		int mod7 = (int) sonuc % 7;
		String Gun;
		switch (mod7) {
		case 1:
			Gun = "Pazartesi";
			break;
		case 2:
			Gun = "Sal�";
			break;
		case 3:
			Gun = "�ar�amba";
			break;
		case 4:
			Gun = "Per�embe";
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
			Gun = "Hatal� Bir ��lem Yapt�n�z.";
			break;
		}

		System.out.println("Kar��l�k gelen g�n :" + Gun);
		scanner.close();
	}

}
