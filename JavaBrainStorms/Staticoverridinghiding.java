// Program to visualize static polymorphism that hides child method when overridden
class Parent{
	public Parent(){
		System.out.println("In in Parent constructor ");
	}
	static void fun(){
		System.out.println("In Parent's Fun");
	}
}
class Child extends Parent{
	public Child(){
		System.out.println("Hi from child constructor");
	}
	static void fun(){
		System.out.println("In Child's Fun method");
	}
}
class Run{
	public static void main(String args[]){
		Parent ob=new Child(); //Initiating Method overiding
		ob.fun();
	}
}