package learnJava;

import java.util.Scanner;

public class AdSoyad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ad�n�z� giriniz : ");
		String ad=scanner.nextLine();
		System.out.print("Soyad�n�z� giriniz : ");
		String soyad=scanner.nextLine();
		
		System.out.println("Ho� Geldiniz " + ad + " " + soyad);
	}

}
