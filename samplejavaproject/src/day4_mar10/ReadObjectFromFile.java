package day4_mar10;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObjectFromFile {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("E:\\Capg\\cardinfo");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Object obj  ;
			while((obj=ois.readObject()) != null) {
				CardDetails card = (CardDetails) obj;
				System.out.println(card.getCardno()+" "+card.getCvv()+" "+card.getName()+" "+card.getExpirydate());
			}
			ois.close();
			fis.close();
		} 
		catch (IOException | ClassNotFoundException e) {
			//e.printStackTrace();
		}
		
	}

}
