//java program to show case the working of static matheod overriding 

class Parent{
 
	public static void print(){ //Static method in parent class hides the child class method
		
		System.out.println("Hello from Parent method");
	}
}
 
class Child extends Parent{

	public static void print(){
		
		System.out.println("Hello from Child method");
	}
}

class Main{
	
	public static void main(String...a){
		
		Parent ob=new Child();
		ob.print();
	}
}
	
