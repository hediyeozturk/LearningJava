package learnJava.hafta3.robot;

import java.awt.Color;
import java.util.Random;
import java.util.Scanner;

public class testRobot {

	static Random rnd;

	public static void main(String[] args) {
		rnd=new Random();

		Robot robot = new Robot();
		robot.isim = "POKEMON";
		robot.boy = 150;
		robot.renk = "SARI";
		
		robot.kendiniTanit();
		System.out.println();
		
		robot.adimAt(EnumYon.ILERI, 10);
		robot.adimAt(EnumYon.ILERI, 3);
		robot.adimAt(EnumYon.GERI, 7);
		robot.adimAt(EnumYon.ILERI, 1);
		robot.adimAt(EnumYon.GERI, 6);
		
		System.out.println(robot.konum);
		
		int neredesin = robot.neredesin();
		System.out.println(neredesin);
		
		robot.konferansVer("BEN BÝR ROBOTUM YAD ELLERDE");
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Kaç kere hareket etsin");
		int kacKere=scanner.nextInt();
		for (int i = 0; i < kacKere; i++) {
			int adim=rnd.nextInt(20);
			EnumYon enumYon = YonAl();
			robot.adimAt(enumYon, adim);
			System.out.println(enumYon +"'ye " + adim +" Adým");
			neredesin = robot.neredesin();
			System.out.println(neredesin);
		}
	}

	public static EnumYon YonAl() {
		int rndSayi = rnd.nextInt(2);
		switch (rndSayi) {
		case 0:
			return EnumYon.ILERI;
		case 1:
			return EnumYon.GERI;
		default:
			return null;
		}
	}

}
