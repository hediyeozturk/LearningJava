package learnJava.hafta6.File;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;

public class DosyaYazma {

	public static void main(String[] args) {
		File file = new File("Z:\\Java\\java.txt");
		try(FileWriter fileWriter=new FileWriter(file, true) ) {
			//fileappend true ise üstüne yazar
			fileWriter.write( "Bu Bir TEST'tir");
		} catch (Exception e) {
			System.out.println("Dosya yazma hatasý "+e.getMessage());
		}
		
		
		try(FileOutputStream fileOutputStream =new FileOutputStream(file)) {
			String content="Bu da bir test";
			fileOutputStream.write(content.getBytes());
		} catch (Exception e) {
			System.out.println("Dosya yazma hatasý "+e.getMessage());
		}
	}

}
