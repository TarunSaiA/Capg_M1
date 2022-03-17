package day4_mar10;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteToFile {

	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("E:\\Capg\\sample.txt");
			for(int i =65;i<=90;i++)
				fos.write(i);
			fos.close();
			System.out.println("file created");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
