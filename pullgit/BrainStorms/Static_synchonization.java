// java program to showcase static synchronization

class Thread1 extends Thread{ //Thread one class

	public void run() {
		setName("Thread one"); //setting name for thread one.
		Access.print();	//calling static print method from Access.
	}
}

class Access{ //class Access 

	synchronized static  void print() {   //common static synchronized method print()

		for(int i=1;i<=5;i++) { 

			try {

			Thread.sleep(1000); //Making the threads to sleep individually.

			}catch(InterruptedException e){
				e.printStackTrace();
			}
			System.out.println("Thread accessing print() is  : "+Thread.currentThread().getName()); //Printing the name of tthe current thread.
			System.out.println("hi");	//Single content of print() method
		}

	}
}
class Thread2 extends Thread{ //class of Thread one 

	public void run() { // Overrded run method 

		setName("Thread two");  //setting name for thread one.
		Access.print(); 	//calling static print method from Access.

	}
}


class Mainthread{
	public static void main(String...a){ //main thread 

		Thread1 ob1=new Thread1(); //Creating thread one. 

		Thread2 ob2=new Thread2(); //Creating thread two.

		ob1.start(); //starting thread one.

		ob2.start(); //starting thread two.

		System.out.println("Main thread completed"); //main thread is always excuted parallel to other threads.

	}
}

