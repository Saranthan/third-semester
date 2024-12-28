//Java program to show Multiple Inheritance using multiple interface

interface A{
	void helloa();
}

interface B{
	void hellob();
}

class Main implements A,B{ 

	public void helloa(){
		System.out.println("Hello of class A");
	}

	public void hellob(){
	
		System.out.println("Hello of class B");
	}
}
	
class Run{
	public static void main(String...a){
		// A,B obj=new Main();  This is not possible to create the object
		Main ob=new Main();
		ob.helloa();
	}
}
