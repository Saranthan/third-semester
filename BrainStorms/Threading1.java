//java program to showcase multithreading...

class MyThread extends Thread{	
	
	public void run(){
		System.out.println("From the thread one...");
	}
}

class Main{
	public static void main(String...args){ //always this is main thread..
		MyThread t1=new MyThread(); //Thread one
		MyThread t2=new MyThread(); //Thread two
		//t1.run(); //Just invokes the run method but not thread is 			   //created
		t1.start();
		t2.start();
	}
}
		
		
		
