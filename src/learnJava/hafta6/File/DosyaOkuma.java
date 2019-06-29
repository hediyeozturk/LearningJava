package learnJava.hafta6.File;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class DosyaOkuma {

	public static void main(String[] args) {
		File file = new File("Z:\\Java\\okumakicin.txt");
		System.out.println("FileReader");
		FileReader fileReader=null;
		try {
			char[] okunacak = new char[(int) file.length()];
			fileReader= new FileReader(file);
			fileReader.read(okunacak);
			System.out.println(okunacak);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				fileReader.close();
			} catch (IOException exception) {
				System.out.println(exception.getMessage());
			}
		}
		
		System.out.println("FileInputStream");
		
		File file2 = new File("Z:\\\\Java\\\\okumakicin.txt");
		FileInputStream fileInputStream=null;
				
		try {
			fileInputStream = new FileInputStream(file2);
			byte[] buffer = new byte[(int) file2.length()];
			fileInputStream.read(buffer);
			String okunanYazi = new String(buffer);
			System.out.println(okunanYazi);
		} catch (IOException exception) {
			System.out.println(exception.getMessage());
		}		
		
	}

}
