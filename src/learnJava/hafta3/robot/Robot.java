package learnJava.hafta3.robot;

import java.awt.Color;

public class Robot {
	int[] baslangicKonumu = new int[2];
	int[] mevcutKonum = new int[2];
	String model;
	Color color;
	float height;

	public void Robot() {
		// TODO Auto-generated method stub
		baslangicKonumu[0] = 0;
		baslangicKonumu[1] = 0;
		mevcutKonum = baslangicKonumu;
	}

	public void AdimAt(int adim, Yon yon) {
		
		if (yon == Yon.Geri && adim > mevcutKonum[0]) {
			mevcutKonum[0] = 0;
		} else {
			switch (yon) {
			case Ileri:
				mevcutKonum[0] = mevcutKonum[0] + adim;
				break;
			case Geri:
				mevcutKonum[0] = mevcutKonum[0] - adim;
				break;
			}
		}
		Yazdir(mevcutKonum[0] +","+ mevcutKonum[1]);
	}

	public void Zipla(int yukseklik) {
		mevcutKonum[1] = mevcutKonum[1] + yukseklik;
		Yazdir(mevcutKonum[0] +","+ mevcutKonum[1]);
	}

	public void Konus() {
		Yazdir("Selam!");
	}

	static void Yazdir(String value) {
		System.out.println(value);
	}
}
