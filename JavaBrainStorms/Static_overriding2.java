//java program to showcase the non_static and static method overriding 

class Parent{

	public static void print() {

		System.out.println("Hello from Parent class hh");
	}
}

class Child extends Parent{

	public void print(){
		System.out.println("Hello from child class ch ...");
	}
}

class Main{
	
	public static void main(String...a){
		Parent ob=new Child();
		ob.print(); // error cannot override static method since overridden metod is static
	}
}