class A{
	int a=10;
	void display(){
	System.out.println("Inside Class A "+B.d);
	}
	static class B{
		static int d=100;
		static void display(){
		System.out.println("Inside class b "+d);
	}
   }
}
class Run{
	public static void main(String args[]){
	A ob=new A();
	ob.display();
	System.out.println();
	}
}		