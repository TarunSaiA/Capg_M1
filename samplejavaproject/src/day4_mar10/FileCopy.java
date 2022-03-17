package day4_mar10;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileInputStream;

public class FileCopy {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("E:\\Capg\\sample.txt");
			FileOutputStream fos = new FileOutputStream("E:\\Capg\\duplicate_sample.txt");
			int c;
			while((c=fis.read())!=-1)
				fos.write((char)c);
			fos.close();
			System.out.print("File copied");
				
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
