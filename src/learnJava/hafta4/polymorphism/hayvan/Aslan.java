package learnJava.hafta4.polymorphism.hayvan;

public class Aslan extends Hayvan implements IYuruyebilir {

	private Boolean kurkuVarMi;
	
	
	public Boolean getKurkuVarMi() {
		return kurkuVarMi;
	}

	public void setKurkuVarMi(Boolean kurkuVarMi) {
		this.kurkuVarMi = kurkuVarMi;
	}

	@Override
	public void sesCikar() {
		System.out.println("Roarr");
	}

	@Override
	public void Yuru() {
		System.out.println("Yürüdüm");
	}

}
