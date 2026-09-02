package in.co.rays.encapsulation;

public class Account {

	private String number;
	private String accountType;
	private double balance;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposit(double amount) {
		balance = balance + amount;

	}

	public void withdrawal(double amount) {

		if (amount > balance) {
			System.out.println("Insufficient Balance");
		} else {
			balance = balance - amount;
			System.out.println("Balance after withdrawal:-" + balance);
		}
	}

	public void transfer(Account receiver, double amount) {

		if (amount > 0 && amount <= balance) {

			this.balance = this.balance - amount;
			receiver.balance = receiver.balance + amount;

			System.out.println("₹" + amount + " transferred successfully.");
		} else {
			System.out.println("Insufficient balance.");
		}
	}

	public void payBill(double amount) {
		if (amount > 0 && amount <= balance) {
			balance = balance - amount;

			System.out.println("₹" + amount + " bill paid successfully.");
		} else {
			System.out.println("Insufficient balance.");
		}
	}
}
