package learnJava.hafta5.elektronik;

public class BeyazEsya extends ElektronikEsya {

	EnumEnerjiSinifi enerjiSinifi;
	
	public BeyazEsya() {
		System.out.println("Beyaz E�ya Nesnesi Olu�turuldu.");
	}
	
	public void dereceAyarla(int derece) {
		System.out.println("BeyazEsya Derecesi " + derece + " olarak ayarland�.");
	}
	
	public final void overrideEdilemezMetod() {
		System.out.println("Bu metod override edilemez.");
	}

	@Override
	public void fisiTak() {
		// TODO Auto-generated method stub
		
	}
}
