package samplejavaproject;

public class ElectricityCharges {

	public static void main(String[] args) {
		int scno = Integer.parseInt(args[0]) ;
		int presentReading = Integer.parseInt(args[1]) ;
		int previousReading = Integer.parseInt(args[2]);
		double netBill = Integer.parseInt(args[3])  ;
		int fixedCharges;
		int units = presentReading - previousReading;
		char category;
		
	    if(units<=100) {
	    	category = 'A';
	    }
	    else if(units>100 && units<=200) {
	    	category = 'B';
	    }
	    else {
	    	category = 'C';
	    }
	    
	    
		switch(category) {
		case 'A': 
			if(units>50) {
				netBill += (units-50)*2.6;
				netBill += (50*1.45)+30;
			}
			else {
				netBill += (50*1.45)+25;
			}
			break;
		case 'B' :
			if(units>100) {
				netBill += (units-100)*4.30;
				netBill += (100*3.30)+50;
			}
			else {
				netBill += (100*3.30)+25;
			}
			break;
		case 'C' :
			if(units>800) {
				netBill += (units-800)*9.50;
				netBill += (200*5 + 100*7.2 + 100*8.5 + 400*9) +80;
			}
			else if (units>400) {
				netBill += (units-400)*9;
				netBill += (200*5 + 100*7.2 + 100*8.5) + 80;
			}
			else if (units>300) {
				netBill += (units-300)*8.5;
				netBill += (200*5 + 100*7.2) + 80;
			}
	    	else if (units>200) {
		    	netBill += (units-200)*7.2;
			    netBill += (200*5 + 100*7.2) + 60;
		    }
	    	else {
	    		netBill+= (units*5)+50;
			
		    }
			break;
		    }
		System.out.println("Service number : " + scno + "\nTotal units : " + units + "\nNet Bill : " + netBill);

	}


}
