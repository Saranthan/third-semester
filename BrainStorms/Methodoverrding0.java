//java program to demonstrate actual method overriding..

class Animal{
	public void display(){
		System.out.println("I am an animal");
	}
	
}

class Dog extends Animal{
	public void display(){
		System.out.println("I am a dog");  //Complier overrides the derived class's method
	}
}

class Main{
	public static void main(String...a){
		Dog tommy=new Dog();
		tommy.display();
	}
} 