package learnJava.hafta5.elektronik;

public abstract  class ElektronikEsya {
	double fiyat;
	Marka marka;
	int watt;
	byte garantiSuresi;
	
	public ElektronikEsya() {
		System.out.println("Elektronik Eþya Nesne Oluþturuldu.");
	}
	
	public abstract void fisiTak();
}
