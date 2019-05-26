package learnJava.hafta4.polymorphism.hayvan;

public class Kanarya extends Hayvan implements IUcabilir{
	
	@Override
	public void sesCikar() {
		System.out.println("Cik cik");
	}

	@Override
	public void Uc() {
		System.out.println("Uçtumm");		
	}
}
