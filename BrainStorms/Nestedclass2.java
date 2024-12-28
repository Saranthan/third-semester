//java program to show that all inner classes can access the parent class's fields and methods


class Parent{
	public String string="Parent field";
	
	public void display(){ 
		System.out.println("In parent's method"); 
	}

	class Child{
		public String string2="child";
		
		public void display2(){
			//display(); outer class method is also accessible
			System.out.println("Printing feild of outer inside inner class  : "+string); //Outer field is accessible inside inner class 
			System.out.println("In Child's Method");
		}
	}
}

class Driver{
	public static void main(String...a){
		Parent ob=new Parent();
		Parent.Child ob2=ob.new Child();
		System.out.println("Calling display() of parent");
		ob.display();
		ob2.display2();
	}		
}						

	