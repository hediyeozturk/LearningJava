package learnJava.hafta6.exceptions;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.print("Lütfen 1. Sayýyý giriniz :  ");
			int sayi1 = scanner.nextInt();
			System.out.print("Lütfen 2. Sayýyý giriniz :  ");
			int sayi2 = scanner.nextInt();
			CarpimClass carpimClass=new CarpimClass();
			int sonuc=carpimClass.Hesapla(sayi1, sayi2);
			System.out.println(sonuc);
			scanner.close();
		
		} catch (MyException myException) {
			System.out.println(myException.toString());
		}
	}

}
