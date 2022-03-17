package day2;

public class Placement extends Examination {
	private int interviewsAttended;
	private String Status;
	

	public Placement(int regno, String name, String group,int sub1,int sub2,int sub3,int interviewsAttended,String status) {
		super(regno, name, group,sub1,sub2,sub3);
		this.interviewsAttended = interviewsAttended;
		this.Status = status;
		
	}
    void show() {
    	System.out.println(interviewsAttended+" "+Status);
    }

	public static void main(String[] args) {
    	Placement obj = new Placement(220,"Tarun","EEE",45,65,87,4,"Selected");
    	obj.display();
    	obj.result();
    	obj.show();
    	
    	
    	
		
	}

}
