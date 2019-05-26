package learnJava.hafta4.polymorphism.hayvan;

public class Fil extends Hayvan implements IYuruyebilir {

	private int hortumBoyu;
	
	public int getHortumBoyu() {
		return hortumBoyu;
	}
	public void setHortumBoyu(int hortumBoyu) {
		this.hortumBoyu = hortumBoyu;
	}
	
	@Override
	public void sesCikar() {
		System.out.println("wuuu");
	}
	@Override
	public void Yuru() {
		System.out.println("adým attým");		
	}
	
}
