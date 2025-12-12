//java program to showchase the concept of sum of n numbers

class Sum{
	private int n ;
	private int sum;
	public Sum(int n){
		this.n=n;
	}
	
	private void compute(){
		System.out.println("The sum of first "+n+" is "+((n*(n+1)/2)));
	}
	
	//initializing driver
	public static void main(String...a){
		new Sum(10).compute();
	}
}
			