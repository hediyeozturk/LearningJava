package learnJava.hafta2.Kitap;

import java.util.Scanner;

public class KitapEkle {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Ka� kitap ekleyeceksiniz?");
		int kitapAdet=scanner.nextInt();
		
		Kitap[] kitaplar=new Kitap[kitapAdet];
		
		for (int i = 0; i < kitaplar.length; i++) {
			Kitap kitap=new Kitap();
			
			System.out.println(i+1 + ". Kitab�n Ad� : ");
			kitap.KitapAdi=scanner.next();
			
			System.out.println(i+1 + ". Kitab�n Yay�n Y�l� :");
			kitap.YayinYili=scanner.nextInt();
			
			kitaplar[i]=kitap;
		}
		Boolean cikis=false;  
		while(cikis) {
			System.out.println("----------------------------");
			System.out.println("Hangi Y�l? ");
			int yil=scanner.nextInt();
			
			for (Kitap kitap : kitaplar) {
				if(kitap.YayinYili==yil) {
					System.out.println(kitap.KitapAdi);
				}
			}
			System.out.println("-----�IKMAK ���N C'ye bas?--------");
			if(scanner.next()=="C") {
				cikis=true;
			}
		}
		
		scanner.close();
		
	}

}
