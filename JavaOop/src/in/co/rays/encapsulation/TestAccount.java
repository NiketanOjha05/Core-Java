package in.co.rays.encapsulation;

public class TestAccount {

	public static void main(String[] args) {

		Account ac1 = new Account();

		ac1.setNumber("AC6468636666");
		ac1.setBalance(10000.00);
		ac1.setAccountType("Saving");

		System.out.println("Account Number : " + ac1.getNumber());

		System.out.println("Account Type : " + ac1.getAccountType());

		System.out.println("Account Balance: " + ac1.getBalance());

		ac1.deposit(50000.0);

		System.out.println("Balance: ₹" + ac1.getBalance());

		System.out.println();

		System.out.println("===== WITHDRAWAL =====");

		ac1.withdrawal(5000);

		System.out.println();

		System.out.println("===== BILL PAYMENT =====");

		ac1.payBill(2000);

		System.out.println("Account 1 Balance: ₹" + ac1.getBalance());

		System.out.println();

		Account ac2 = new Account();

		ac2.setNumber("AC5454456576");
		ac2.setAccountType("Savings");
		ac2.setBalance(100000.0);

		System.out.println("===== ACCOUNT 2 =====");

		System.out.println("Account Number: " + ac2.getNumber());
		System.out.println("Account Type: " + ac2.getAccountType());

		System.out.println();

		System.out.println("===== TRANSFER =====");

		System.out.println(" Before Transfer:");

		System.out.println();

		System.out.println("Account 1 Balance: ₹" + ac1.getBalance());

		System.out.println("Account 2 Balance: ₹" + ac2.getBalance());

		ac1.transfer(ac2, 10000);

		System.out.println("After Transfer:");

		System.out.println();

		System.out.println("Account 1 Balance: ₹" + ac1.getBalance());

		System.out.println("Account 2 Balance: ₹" + ac2.getBalance());

	}

}
