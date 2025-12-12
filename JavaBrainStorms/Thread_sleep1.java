class Main {
	public static void main(String...a){
		Thread mainthread=Thread.currentThread();
		try{
		for(int i=0;i<=5;i++){
			Thread.sleep(1000);
			System.out.println("Hi");
			}
		}
		catch(InterruptedException e){
			System.out.println("InterruptedException e =>"+e.getMessage());
		}
	}
}