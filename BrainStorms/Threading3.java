//java program to show Thread life cycle...

class MyThread extends Thread{	
	
	public void run(){
		System.out.println("Current Thread running is : "+currentThread().getName());
		System.out.println("The state of current thread is : "+currentThread().getState());
		try{
			Thread.sleep(2000);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}

class Main{
	public static void main(String...args){	  //always this is main thread..

		MyThread t1=new MyThread(); //Thread one
		MyThread t2=new MyThread(); //Thread two
		t1.setName("Gowri"); //setting nameof thread one
		t2.setName("Äbi"); //setting name of thread two

		System.out.println(t1.getName());
		System.out.println(t2.getName());
			
		System.out.println("The current state before starting : "+t1.getState());

		t1.start(); //seperate flow or path of execution is created

		try{
			t1.join();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		System.out.println("The current state after starting : "+t1.getState());
		

		System.out.println();

		System.out.println("The current state before starting : "+t2.getState());


		t2.start();

		try{
			t2.join();
		}catch(Exception e){
			e.printStackTrace();
		}

		System.out.println("The current state after starting : "+t2.getState());

	}
}
		
		
		
