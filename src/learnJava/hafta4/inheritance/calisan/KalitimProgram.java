package learnJava.hafta4.inheritance.calisan;

public class KalitimProgram {

	public static void main(String[] args) {
		Calisan calisan = new Calisan();
		calisan.cinsiyet = EnumCinsiyet.ERKEK;
		calisan.isim = "Ali Veli";
		calisan.maas = 2340f;
		calisan.yas = 34;
		
		Egitmen egitmen = new Egitmen();
		egitmen.iseGelir();
	}

}
