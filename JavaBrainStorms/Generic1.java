//java program to chow case the functionality of generics 

class Sample<E>{ //Here the generic type maybe of any character
	E variable;
	public Sample(E variable){
		this.variable=variable;
	}

	public void display(){
		System.out.println("Priniting generic "+this.variable);
	}
} 

class Main{
	public static void main(String...a){ //note always the Generic firld must be of name wrapper classes;

  							
		Sample<String> ob=new Sample<String>("Tharanetharan"); //Creates a new generic variable String.
		Sample<Integer> obj=new Sample<Integer>(1000); //creates a new Generic object of type Integer
		ob.display();
		obj.display();

	}
}
		