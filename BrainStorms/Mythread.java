class Mythread extends Thread{
	public void run(){
		System.out.println("Thread one started running ");
	}
	
	{
	System.out.println("Outside Mythread ");
	}
public static void main(String...a){
	Mythread ob=new Mythread();
	ob.start();
}
}
