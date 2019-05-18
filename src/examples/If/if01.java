package examples.If;
import java.util.Scanner;

public class if01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Ýlk sayý = ");
		int sayi1 = scan.nextInt();

		System.out.print("Ýkinci sayý = ");
		int sayi2 = scan.nextInt();

		if (sayi1 > sayi2) {
			System.out.println(sayi1 + " büyüktür " + sayi2);
		} else if (sayi1 < sayi2) {
			System.out.println(sayi2 + " büyüktür " + sayi1);
		} else {
			System.out.println(sayi1 + " eþittir " + sayi2);
		}
		
		scan.close();
	}
}
