abstract class BankAccount {

	protected double balance;

	public BankAccount(double balance) {
	this.balance = balance;
	}

	public abstract void deposit(double amount);
	public abstract void withdraw(double amount);
	}

class SavingsAccount extends BankAccount {

	public SavingsAccount(double balance) {
		super(balance);
	}
	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
	if (balance >= amount) {
		balance -= amount;
	} else {
		System.out.println("Insufficient funds");
	}
   }
}

class CheckingAccount extends BankAccount {
	public CheckingAccount(double balance) {
		super(balance);
	}	
	public void deposit(double amount) {
		balance += amount;
	}
	public void withdraw(double amount) {
		double fee = 0.1 * amount;
		if (balance >= amount + fee) {
			balance -= amount + fee;
		} else {
			System.out.println("Insufficient funds");
		}
	}
}

class Customer {
	private BankAccount account;
	public Customer(BankAccount account) {
		this.account = account;
	}

	public void displayBalance() {
		System.out.println("Current balance: " + account.balance);
	}

	public void deposit(double amount) {
		account.deposit(amount);
	}
	public void withdraw(double amount) {
		account.withdraw(amount);
	}
}
class AbstractExample {
	public static void main(String[] args) {
		BankAccount account = new CheckingAccount(1000.0);
		Customer customer = new Customer(account);
		customer.displayBalance();
		customer.deposit(500.0);
		customer.displayBalance();
		customer.withdraw(200.0);
		customer.displayBalance();
		customer.withdraw(1500.0); // Should print "Insufficient funds"
   }
}