package learnJava.hafta5.elektronik;

public abstract  class ElektronikEsya {
	double fiyat;
	Marka marka;
	int watt;
	byte garantiSuresi;
	
	public ElektronikEsya() {
		System.out.println("Elektronik E�ya Nesne Olu�turuldu.");
	}
	
	public abstract void fisiTak();
}
