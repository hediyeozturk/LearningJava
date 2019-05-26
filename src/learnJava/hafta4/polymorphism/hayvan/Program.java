package learnJava.hafta4.polymorphism.hayvan;

import java.awt.Color;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fil fil =new Fil();
		fil.setCinsiyet(EnumCinsiyet.Diþi);
		System.out.println(fil.getCinsiyet());
		fil.sesCikar();
		
		Aslan aslan=new Aslan();
		aslan.setKurkuVarMi(false);
		aslan.setRenk(Color.YELLOW);
		aslan.setCinsiyet(EnumCinsiyet.Erkek);
		System.out.println(aslan.getRenk());
		aslan.sesCikar();

	}

}
