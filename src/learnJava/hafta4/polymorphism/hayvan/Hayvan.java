package learnJava.hafta4.polymorphism.hayvan;

import java.awt.Color;

public abstract class Hayvan {
	private Color renk;
	private EnumCinsiyet cinsiyet;
	
	public String getRenk() {
		return String.valueOf(renk.getRGB());
	}

	public void setRenk(Color renk) {
		this.renk = renk;
	}

	public EnumCinsiyet getCinsiyet() {
		return cinsiyet;
	}

	public void setCinsiyet(EnumCinsiyet cinsiyet) {
		this.cinsiyet = cinsiyet;
	}

	public abstract void sesCikar();		
}
