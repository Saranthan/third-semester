//Threading using interface


class Myrunnable implements Runnable{
	public void run(){
		for (int i=1;i<=5;i++){
			System.out.println("i = "+i);
		try{
			Thread.sleep(1000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	    }
	}
} 

class Main{
	public static void main(String...a){
	//Myrunnable ob1=new Myrunnable();
	Thread t1=new Thread(new Myrunnable(),"thread one");
	t1.start();
     }
}