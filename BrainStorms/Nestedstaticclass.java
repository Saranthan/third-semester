//java program to show that all inner classes can access the parent class's fields and methods


class Parent{ //always outer class cannot be static
	public String string="Parent";
	
	public void display(){
		System.out.println("In parent's method");
	}

	static class Child{
		public  String string2="child";
		string="changed string by the inner class";
		public static void display2(){
			System.out.println(string);
			System.out.println("In Child's Method");
		}
	}
}

class Driver{
	public static void main(String...a){
		Parent ob=new Parent();
		ob.display();
		Parent.Child.display2();
	}		
}						

	