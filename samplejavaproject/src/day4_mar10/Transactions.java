package day4_mar10;

import java.util.ArrayList;
import java.util.Collections;

public class Transactions {
	ArrayList<Account> accountList = new ArrayList<Account>();
	public Transactions() {
		accountList.add(new Account(110011,"Pavan",50000));
		accountList.add(new Account(221133,"Vamsi",40000));
		accountList.add(new Account(334433,"Venkat",46000));
		accountList.add(new Account(827473,"Sai",45678));
	}
	public void deposit(int acno,double amount) {
		int f=0;
		for(Account i : accountList) {
			if(i.getAccountNumber()==acno) {
				f=1;
				i.setBalance(i.getBalance()+amount);
				break;
			}
		}if(f==0)
			System.out.println("Account not present");
	}
	public void withdraw(int acno,double amount) {
		int f=0;
		for(Account i : accountList) {
			if(i.getAccountNumber()==acno) {
				f=1;
				if(i.getBalance()<amount) {
					System.out.println("Withdraw not possible due to insufficient balance");
					break;
				}
				i.setBalance(i.getBalance()-amount);
				break;
			}
		}if(f==0)
			System.out.println("Account not present");
	}
	public void checkBalance(int acno) {
		int f=0;
		for(Account i : accountList) {
			if(i.getAccountNumber()==acno) {
				System.out.println("Balance: "+i.getBalance());
			}
		}if(f==0)
			System.out.println("Account not present");
	}
	public void viewAccountList() {
		Collections.sort(accountList,(acc1,acc2)->{
			return acc1.getAccountNumber() - acc2.getAccountNumber();
		});
		accountList.forEach((a)->System.out.println(a.getAccountNumber()+
				" "+a.getCustomerName()+" "+a.getBalance()));
	}
}