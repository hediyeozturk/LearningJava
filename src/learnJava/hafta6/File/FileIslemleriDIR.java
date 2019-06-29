package learnJava.hafta6.File;

import java.io.File;
import java.util.Scanner;

public class FileIslemleriDIR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String komut;
		String path;
		File file;

		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("Dosya yolunu giriniz.");
			path = scanner.nextLine();
			file = new File(path);
		} while (!file.isDirectory());

		while (1 == 1) {
			System.out.print(path + ">");
			komut = scanner.nextLine();
			if (komut.equals("DIR")) {
				File[] files=file.listFiles();
				for (File fileOfDir : files) {
					System.out.println("        "+fileOfDir.getName());
				}
			}
			if(komut.startsWith("cd ")){
				String newPath=path+"\\"+komut.substring(3);
				File newFile=new File(newPath);
				if(newFile.exists()) {
					if(newFile.isDirectory()) {
						file=newFile;
						path=newPath;
					}
					else System.out.println("Dizin adý geçersiz.");
					
				}
				else 	System.out.println("Sistem belirtilen yolu bulamýyor.");
								
			}

		}

	}

}
