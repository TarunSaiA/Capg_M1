package day2;

public class AccountMain {

	public static void main(String[] args) {
		Account acn = new Account();
		acn.setAcno(29057);
		acn.setName("Tarun");
		acn.setBalance(15000);
		
		System.out.println(acn.getAcno() + " " + acn.getName() + " " + acn.getBalance());

	}

}
