package learnJava.hafta4.polymorphism.hayvan;

import java.util.Scanner;

public class KullaniciyaSor {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);

		System.out.println("1. Aslan");
		System.out.println("2. Kanarya");
		System.out.println("3. Fil");
		System.out.println("Hangi hayvan� tan�mlamak istiyorsunuz?");
		
		String secim=scanner.next();
		
		switch (secim) {
		case "1":
			//Aslan aslan=new Aslan();
			System.out.println("K�rk� var m�?  1 0 ");
			
//			boolean kurkuVarMi=scanner.
//			aslan.setKurkuVarMi(kurkuVarMi);
			break;
			
		case "2":
			break;

		case "3":
		break;
		default:
			System.out.println("Ge�ersiz bir de�er girdiniz.");
			break;
		}
		scanner.close();

	}

}
