package day4_mar10;

import java.util.Scanner;
public class BankApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Transactions t = new Transactions();
		int accno,f=0;
		double bal;
		while(true) {
			System.out.println("Enter your choice \n1.Deposit\n2.Withdraw\n3.Check Balance\n4.Exit");
			int choice = s.nextInt();
			switch(choice) {
			case 1:System.out.println("Enter account number:");
					accno=s.nextInt();
					System.out.println("Enter amount");
					bal=s.nextDouble();
					t.deposit(accno, bal);
					break;
			case 2:System.out.println("Enter account number:");
					accno=s.nextInt();
					System.out.println("Enter amount");
					bal=s.nextDouble();
					t.withdraw(accno, bal);
					break;
			case 3: System.out.println("Enter account number:");
					accno=s.nextInt();
					t.checkBalance(accno);
					break;
			case 4: f=1;
					break;
			default: System.out.println("Enter correct choice");
					break;
			}
			if(f==1)
				break;
		}
	}

}
