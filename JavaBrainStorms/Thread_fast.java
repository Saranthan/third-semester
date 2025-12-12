//java program to show that one thread is faster than other

class Mythread1 extends Thread{
	public void run(){
		for(int i=1;i<=5;i++){
		try{
			System.out.println("Printing thread "+currentThread().getName());
			Thread.sleep(1000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		}
	}
}

class Mythread2 extends Thread{
	public void run(){
		for(int i=1;i<=5;i++){
		try{
			System.out.println("Printing thread "+currentThread().getName());
			Thread.sleep(2000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	   }
	}
}

class Main{
	public static void main(String...a){
		Mythread1 t1=new Mythread1();
		Mythread2 t2=new Mythread2();
		t1.start();
		t2.start();
	}
}