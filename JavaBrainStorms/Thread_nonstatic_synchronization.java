class Access extends Thread{
	public synchronized void print(){
		System.out.println("The thread accessing Access class is : "+currentThread().getName());
	}
}

class Mythread1 extends Thread{
	public void run(){
		Access ob1=new Access();
		for(int i=1;i<=5;i++){
		try{
			ob1.print();
			Thread.sleep(1000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	   }
	}
}

class Mythread2 extends Thread{
	public void run(){
		Access ob2=new Access();
		for(int i=1;i<=5;i++){
		try{
			ob2.print();
			Thread.sleep(1000);
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