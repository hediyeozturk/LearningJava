package learnJava.hafta3.robot;

import java.awt.Color;

public class Robot {
//	int[] baslangicKonumu = new int[2];
//	int[] mevcutKonum = new int[2];
	String isim;
	String renk;
	int boy;
	int konum;

	public Robot() {
		
	}

	void konferansVer(String konusmaMetni) {
		System.out.println(konusmaMetni);
	}
	
	public void adimAt(EnumYon yon, int adimSayisi) {
		
		if (EnumYon.ILERI.equals(yon)) {
			konum += adimSayisi;
		} else {
			konum -= adimSayisi;
		}
	}

	public void kendiniTanit() {
		System.out.printf("Ýsim = %s, rengim = %s, boyum = %d", isim, renk, boy);
	}
	
	public int neredesin() {
		return konum;
	}
}
