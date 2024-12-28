class Mythread extends Thread{
	void run(){
		System.out.println("Thread one started running ");
	}
	

public static void main(String...a){
	Mythread ob=new Mythread();
	ob.start();
}
}
