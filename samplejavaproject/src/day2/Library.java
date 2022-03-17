package day2;

public class Library extends Student1{
	private int booksTaken;

    public Library(int regno, String name, String group, int booksTaken) {
	     super(regno, name, group);
	     this.booksTaken = booksTaken;
    }
    
	void output() {
    	System.out.println(regno+" "+name+" "+group+" "+booksTaken);
    }

	public static void main(String[] args) {
		Library lib = new Library(220, "Tarun","EEE",6);
		lib.display();
		lib.output();
		lib.toString();
		
	}

}
