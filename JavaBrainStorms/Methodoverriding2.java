// Method overriding while parent method is static
class Parent{
	public Parent(){
		System.out.println("In parent's Constructor");
	}
	static void fun(){
		System.out.println("Hi from parent fun ");
	}
}
 class Child extends Parent{
	public Child(){
		System.out.println("In child's Constructor");
	}
	void fun(){
		System.out.println("Hi from parent's fun");
	}
}
	
class Run{
	public static void main(String args[]){
		Parent obj=new Child();
		obj.fun();
	}
}
