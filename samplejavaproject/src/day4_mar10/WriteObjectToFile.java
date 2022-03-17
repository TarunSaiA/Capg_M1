package day4_mar10;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjectToFile {

	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("E:\\Capg\\cardinfo");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			CardDetails card1 = new CardDetails(123455566, 456, "Tarun", "10/26");
			CardDetails card2 = new CardDetails(235263562, 234, "Lucky", "06/24");
			oos.writeObject(card1);
			oos.writeObject(card2);
			oos.close();
			fos.close();
			System.out.println("Created");
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
