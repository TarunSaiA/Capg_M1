package day2;

public class Examination extends Student1 {
	protected int sub1 ;
	protected int sub2 ;
	protected int sub3;
	protected int total;
	protected int average;
	
	
	public Examination(int regno, String name, String group,int sub1,int sub2,int sub3) {
		super(regno, name, group);
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
		this.total = sub1+sub2+sub3;
		this.average = total/3;
	}
	
    void result() {
    	if(sub1>=40 && sub2>=40 && sub3>=40) {
    		System.out.print(" "+total+" "+average+" "+"Pass"+" ");
    		}
    	else{
    	    System.out.print(" "+total+" "+average+" "+"Fail"+" ");
    		}
    	}
    }
	
	
	
	


