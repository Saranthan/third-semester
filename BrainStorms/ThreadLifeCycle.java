//java program to showcase the complete the life cycle

class Thread1 extends Thread{
	
	public void run(){

		for(int i=0;i<=5;i++){
			System.out.println("hi");
			try{
			System.out.println("Current state is : "+ this.getState());
			Thread.sleep(1000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}

		}
		
	}

	public void afterrun(){
	System.out.println("After running "+this.getState());
	}
}

class Main1{
	public static void main(String...a){
		Thread1 ob=new Thread1();
		ob.setName("Thread 1");
		System.out.println("current state of thread before start  is : "+ob.getState());
		ob.start();
		System.out.println("current state of thread after start  is : "+ob.getState());
		try{
			ob.join();
			ob.afterrun();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println("Main executed");

	}
}