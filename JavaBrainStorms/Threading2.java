//java program to showcase multithreading...

class MyThread extends Thread{	
	
	public void run(){
		System.out.println("Current Thread running is : "+currentThread().getName());
		try{
			Thread.sleep(5000);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}

class Main{
	public static void main(String...args){ //always this is main thread..
		MyThread t1=new MyThread(); //Thread one
		MyThread t2=new MyThread(); //Thread two
		
		t1.start(); //seperate flow or path of execution is created
		t2.start(); //seperate flow or path of execution is created

		System.out.println("main Thread completed");
		//main thread is always is always executed first.. 
	}
}
		
		
		
