package learnJava.hafta6.exceptions;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.print("L�tfen 1. Say�y� giriniz :  ");
			int sayi1 = scanner.nextInt();
			System.out.print("L�tfen 2. Say�y� giriniz :  ");
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
