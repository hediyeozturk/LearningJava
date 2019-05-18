package learnJava.hafta2.Kitap;

import java.util.Scanner;

public class KitapEkle {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Kaç kitap ekleyeceksiniz?");
		int kitapAdet=scanner.nextInt();
		
		Kitap[] kitaplar=new Kitap[kitapAdet];
		
		for (int i = 0; i < kitaplar.length; i++) {
			Kitap kitap=new Kitap();
			
			System.out.println(i+1 + ". Kitabýn Adý : ");
			kitap.KitapAdi=scanner.next();
			
			System.out.println(i+1 + ". Kitabýn Yayýn Yýlý :");
			kitap.YayinYili=scanner.nextInt();
			
			kitaplar[i]=kitap;
		}
		Boolean cikis=false;  
		while(cikis) {
			System.out.println("----------------------------");
			System.out.println("Hangi Yýl? ");
			int yil=scanner.nextInt();
			
			for (Kitap kitap : kitaplar) {
				if(kitap.YayinYili==yil) {
					System.out.println(kitap.KitapAdi);
				}
			}
			System.out.println("-----ÇIKMAK ÝÇÝN C'ye bas?--------");
			if(scanner.next()=="C") {
				cikis=true;
			}
		}
		
		scanner.close();
		
	}

}
