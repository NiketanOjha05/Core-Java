package in.co.rays.exception;

public class TestAccount {
	
	public static void main(String[] args) {
		
		Account a = new Account();
		
		a.setBalance(2000.00);
		System.out.println("current balance" + a.getBalance());
		
		a.withdraw(1000.00);
	}

	}


