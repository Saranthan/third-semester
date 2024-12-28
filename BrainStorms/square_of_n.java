//java Program to find the square of first n integers
 class Find_sq{
	int n;
	public Find_sq(int n){
		this.n=n;
	}
	
	public void printsq(){
		for(int i=1;i<=n;i++){
			Sysntem.out.println(i*i);
		}
		System.out.println("Loop completed");
	}
}

class Main{	
	public static void main(String...a){
		Find_sq ob=new Find_sq(100);
		ob.printsq();
	}
}