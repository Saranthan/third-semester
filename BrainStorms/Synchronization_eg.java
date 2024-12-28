//java program to show an real world application of threads.

class Bankaccount{
	protected int balance =10000;
	
	synchronized  void deposit(int amt ){
		balance+=amt;
		System.out.println("Balance has been updated");
		notify();
	}

	synchronized void withdraw(int amt){
		if(balance==amt){
			System.out.println("Balance updated");
			balance-=amt;
		}else{
			System.out.println("Making thread wait");
			try{							
			wait(2000);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}
class User1 extends Thread{	
	public void run(){
		Bankaccount user1=new Bankaccount();
		for(int i=0;i<=5;i++){
			user1.deposit(1000000);
			try{
			Thread.sleep(1000);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}

class User2 extends Thread{	
	public void run(){
		Bankaccount user2=new Bankaccount();
		for(int i=0;i<=5;i++){
			user2.withdraw(100000);
			try{
			Thread.sleep(1000);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}

class CBS{
	public static void main(String...a){
		User1 t1=new User1();
		User2 t2=new User2();
		t2.start();
		t1.start();
		System.out.println("Main exceuted..");
	}
}