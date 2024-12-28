//static multiple hiding method overriding
	
class Parent{
	public Parent(){
		System.out.println("In parent Constrcutor");
	}
	void fun(){
		System.out.println("In the Parents fun ");
	}
} 

class Parent1 extends Parent{
	public Parent1(){
		System.out.println("In parent1 Constructor");
	}
	void fun(){
		System.out.println("In parent1's' fun ");
	}
}
class Child extends Parent1{
	public Child(){
		System.out.println("In child Constructor");
	}
	void fun(){
		System.out.println("In Child's fun ");
	}
}
class Run{
	public static void main(String args[]) {
		Parent ob=new Parent1();
		System.out.println();
		Parent1 obj=new Child();
		obj.fun();
	}
}