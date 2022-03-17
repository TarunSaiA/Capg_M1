package day4_mar10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleInputs {

	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("Enter code name salary");
		InputStreamReader isr = new InputStreamReader (System.in);
		BufferedReader br = new BufferedReader(isr);
		int code = Integer.parseInt(br.readLine());
		String name = br.readLine();
		double sal = Double.parseDouble(br.readLine());
		System.out.println(code+" "+name+" "+sal);
	}

}
