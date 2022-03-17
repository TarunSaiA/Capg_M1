package day3_mar9;

class AccountNotFoundException extends Exception{
	public AccountNotFoundException() {
		System.out.println("Account not available !!!!");
	}
}
class InsufficientBalanceException extends Exception{
	public InsufficientBalanceException() {
		System.out.println("Required amount is not available !!!!");
	}
}

public class Bank_Transaction {

	public static void main(String[] args) {
		int acno = Integer.parseInt(args[0]);
		int balance = Integer.parseInt(args[1]);
		try {
			if(acno == 1001 && balance>1000) {
				System.out.println("Transaction sucessfull and remaining balance is "+(balance-1000));
			}
			if(acno!=1001) {
				throw new AccountNotFoundException();
			}
			if(balance<1000) {
			   throw new InsufficientBalanceException();
			}
				
		}
		
		catch (AccountNotFoundException | InsufficientBalanceException e) {
			e.printStackTrace();
			//System.out.println(e.getMessage());
		}

	}

}
