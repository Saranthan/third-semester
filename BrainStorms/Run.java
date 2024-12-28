class Animal{
	Animal(){
	System.out.println("Hello I'm in Constructor of parent class");
	}
	void print1(){
	  System.out.println("I will Print from Animal ");
	}

}
class Dog extends Animal{
	Dog(){
	super();
	System.out.println("Hello I'm in Constructor of child class");
	print();
	}
	void print(){
	  System.out.println("I will Print as Dog");
	}
}
class Run{
	public static void main(String args[]){
	  Animal ob=new Dog();
	  super();
 }
}	