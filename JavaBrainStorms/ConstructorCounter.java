class Counter{
	static int Counter;

	public Counter(){
		Counter+=1;
	}

	static void display(){
	System.out.println("Counter :"+Counter);
	}
}
class Run{
	public static void main(String args[]){
	Counter ob1=new Counter();
	Counter ob2=new Counter();
	Counter ob3=new Counter();
	Counter ob4=new Counter();
	Counter.display();
	}	
}