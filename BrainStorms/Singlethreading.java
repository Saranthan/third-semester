//java program to showchase the concept of multi threading
	
class Mythread extends Thread{
	 public void run(){
			for(int i=1;i<=10;i++){
			try{
				System.out.println(Thread.currentThread().getName());
				Thread.sleep(1000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			System.out.println("hi");
		}
		System.out.println("after loop");
	}

}

class Main{
	public static void main(String...a){
	Mythread ob1=new Mythread();
	Mythread ob2=new Mythread();
	System.out.println("Thread 2");
	ob1.start();
	System.out.println("Completed main");
	}
}