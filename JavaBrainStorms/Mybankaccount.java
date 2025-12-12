abstract class Bankaccount{

	protected double balance;

	Bankaccount(int balance){
		this.balance=balance;
	}
		
	abstract void deposit(double balance);
	abstract void withdraw(double balance);
}

class Savingsaccount extends Bankaccount{

	Savingsaccount(double balance){
		super(balance);
	}

	void deposit(double amount){
		balance+=amount;
	}	
	
	public void withdraw(double amount){
		if(balance>=amount){
			balance-=amount;
			System.out.println("Amount withdrawn successfully");
		}else{
			System.out.println("Insuffcient balance");
		}
	}
}

class Checkingaccount extends Bankaccount{
	Savings 