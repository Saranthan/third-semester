class MethodOverloading{
	int a;
	int b;	
	void add(){
	  int a=10;
	  int b=20;
	  System.out.println("Sum is : "+(a+b));
      }
	void add(int a){
	int b=30;
	System.out.println("Sum is : "+(a+b));
	}
	void add(int a,int b){
		this.a=a;
		this.b=b;
		System.out.println("The sum is : "+(a+b));
	}
}
class Run{
	public static void main(String args[]){	
	MethodOverloading ob=new MethodOverloading();
	ob.add(1);
	ob.add(1,2);
}
}