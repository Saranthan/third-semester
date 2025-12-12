//java program to find the factoial of a number

class Fact {
	private int n; 
	private int i=1,fact=1;
 	Fact(int n){
		this.n=n;
	}

	public int find_fact(){
		while(i<=n){
			fact*=i;
			i++;
		}
		return fact;
	}
} 

class Fact_run{
public static void main(String...a){
	Fact ob=new Fact(5);
	System.out.println(ob.find_fact());
}
}