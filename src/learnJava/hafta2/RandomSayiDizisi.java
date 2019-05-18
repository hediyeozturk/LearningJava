package learnJava.hafta2;

import java.util.Random;
import java.util.Scanner;

public class RandomSayiDizisi {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Random rnd = new Random();
		
		System.out.println("Kaç tane sayý girilecek ? ");
		int adet=scanner.nextInt();
		
		int[] sayiDizisi=new int[adet];
		int maxSayi=0;
		for (int i = 0; i < adet; i++) {
			int rastgeleSayi=rnd.nextInt(100);
			sayiDizisi[i]=rastgeleSayi;
			
			if(rastgeleSayi>maxSayi) {
				maxSayi=rastgeleSayi;
			}
			System.out.println(rastgeleSayi);
		}

		System.out.println("En Büyük Sayý: " + maxSayi);
		
		scanner.close();

	}

}
