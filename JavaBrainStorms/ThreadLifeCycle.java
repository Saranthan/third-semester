class A extends Thread{
	public void run(){
		System.out.println("Thread A");
		System.out.println("in thread a");
		for(int i=1;i<=5;i++){
			System.out.println("i= "+i);
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
	}
    }
}

class Threadlifecycle{
	public static void main(String...a){
		A ob=new A();
		ob.start();
	}
}