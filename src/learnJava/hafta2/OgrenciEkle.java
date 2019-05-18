package learnJava.hafta2;

public class OgrenciEkle {

	public static void main(String[] args) {
		Ogrenci ogr = new Ogrenci();
		ogr.isim = "AHMET";
		ogr.boy = 173;
		ogr.cinsiyet = EnumCinsiyet.Erkek;

		System.out.println(ogr.yas);
		System.out.println(ogr.mezunMu);
		if (ogr.kilo > 10) {
			System.out.println(ogr.kilo);
		}
		}

}
