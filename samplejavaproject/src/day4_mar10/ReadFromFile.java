package day4_mar10;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFromFile {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("E:\\Capg\\sample.txt");
			int c;
			while((c=fis.read())!=-1)
				System.out.print((char)c+" ");

		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
