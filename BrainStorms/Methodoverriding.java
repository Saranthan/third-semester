//Method over riding example
class Parent{
	public Parent(){
		System.out.println("Parent constructor invoked");
	}
	void print(){
		System.out.println("Hello from parent method");
	}

}

class Child extends Parent{
	public Child(){	
		System.out.println("Child constructor invoked");
	}
	void print(){
		System.out.println("Hello from child method");
	}

}

class Run{
	public static void main(String args[]){

		Parent obj=new Parent();
		obj.print();	// calling print with parent object
		System.out.println();

		Child obj1=new Child();
		obj1.print();  //calling print with child object
		System.out.println();


		Parent obb=new Child();
		obb.print(); //overriding print method aka dynamic polymorphism
		System.out.println();

	}
}