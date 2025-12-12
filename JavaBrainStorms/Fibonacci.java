//java program to print the Fibonacci sequence of numbers

class Fibo{
	protected int num;
	
	Fibo(int num){
		this.num=num;
	}

	public long fibo(long number){
		if(number<=1)
			return number;
		else
			//System.out.println(number);
			return fibo(number-1)+fibo(number-2);
	}
}

class Run{
	public static void main(String...a){
		Fibo ob=new Fibo(10);
		System.out.println(ob.fibo(50));
	}
}


