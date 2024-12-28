//java program to show that all inner classes can access the parent class's fields and methods


class Parent{ //always outer class cannot be static
<<<<<<< HEAD
	private String string="Parent";
=======
	public String string="Parent";
>>>>>>> BrainStorms
	
	public void display(){
		System.out.println("In parent's method");
	}

	static class Child{
<<<<<<< HEAD
		private String string2="child";
		string="changed string by the inner class";
		public void display2(){
=======
		public  String string2="child";
		string="changed string by the inner class";
		public static void display2(){
>>>>>>> BrainStorms
			System.out.println(string);
			System.out.println("In Child's Method");
		}
	}
}

class Driver{
	public static void main(String...a){
		Parent ob=new Parent();
		ob.display();
<<<<<<< HEAD
		Parent.Child ob2=new Parent.Child();
		ob2.string2="Changed child";
		System.out.println("Calling child using parent Object");
		ob2.display2();
=======
		Parent.Child.display2();
>>>>>>> BrainStorms
	}		
}						

	