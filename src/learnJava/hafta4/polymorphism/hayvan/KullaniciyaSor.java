package learnJava.hafta4.polymorphism.hayvan;

import java.util.Scanner;

public class KullaniciyaSor {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);

		System.out.println("1. Aslan");
		System.out.println("2. Kanarya");
		System.out.println("3. Fil");
		System.out.println("Hangi hayvaný tanýmlamak istiyorsunuz?");
		
		String secim=scanner.next();
		
		switch (secim) {
		case "1":
			//Aslan aslan=new Aslan();
			System.out.println("Kürkü var mý?  1 0 ");
			
//			boolean kurkuVarMi=scanner.
//			aslan.setKurkuVarMi(kurkuVarMi);
			break;
			
		case "2":
			break;

		case "3":
		break;
		default:
			System.out.println("Geçersiz bir deðer girdiniz.");
			break;
		}
		scanner.close();

	}

}
