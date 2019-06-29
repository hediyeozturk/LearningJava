package learnJava.hafta6.File;

import java.io.File;
import java.util.Scanner;

public class FileIslemleri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Dosya yolunu giriniz.");
		String path = scanner.nextLine();

		File file = new File(path);
		boolean isDirectory = file.isDirectory();
		if (isDirectory) {
			System.out.println("Bu bir dizin.");
		}

		boolean exists = file.exists();
		if (!exists) {
			System.out.println("Belirtilen adreste dosya bulunamadý");
		}

		boolean isFile = file.isFile();
		if (isFile) {
			System.out.println("Bu bir dosyadýr.");
		}

		File parentFile=file.getParentFile();
		if (parentFile != null) {
			System.out.println("Üst Dizini: " + parentFile);
		}
		
		
		scanner.close();
	}

}
