package samplejavaproject;

public class StringEx {

	public static void main(String[] args) {
		String str = "tarun";
		for(int i=0;i<str.length();i++) {
			System.out.println(str.charAt(i));
		}
		System.out.println();
		
		for(int i=0;i<str.length();i++) {
			for(int j=0;j<=i;j++) {
			System.out.print(str.charAt(j));
			}
			System.out.println();
		}
		
		System.out.println();
		
		String rev = "";
		String mon = "jan";
		for(int i = str.length()-1; i >= 0; i--) {
			rev = rev + str.charAt(i);    
		}
		if(str.equals(rev))  
		   System.out.println("Palindrome" );
		else
			System.out.println("Not a Palindrome");
		
		System.out.println();
		
		switch(mon) {
		   case "jan": 
		   case "mar" :
		   case "may":
		   case "jul":
		   case "aug":
		   case "oct":
		   case "dec":
			   System.out.println("This " + mon + " month contains 31 days");
			   break;
		   case "apr": 
		   case "jun" :
		   case "sep":
		   case "nov":
			   System.out.println("This " + mon + " month contains 30 days");
			   break;
		   case "feb":
			   System.out.println("This " + mon + " month contains 28 or 29 days");
			   break;
		   default:
			   System.out.println("Not a valid month");
		}
		
		
		
		

	}

}
