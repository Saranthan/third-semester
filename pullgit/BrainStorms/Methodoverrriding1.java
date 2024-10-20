//Java program to showcase the dynamic dispatch aka (runime polymorphism)

class Parent{ //parent class

	public void hello(){ //hello of superclass

		System.out.println("Saying hello from parents class");
	}
}

class Child extends Parent{  //child class extending superclass

	@Override
	public void hello() {  //Hello of derived class

		System.out.println("Saying hello from child class");
	}
} 

class Main{
	public static void main(String...a){
		Parent ob=new Child();
		ob.hello();
	}
}