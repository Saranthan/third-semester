//java program to show that all inner classes can access the parent class's fields and methods


class Parent{
	private String string="Parent";
	
	public void display(){
		System.out.println("In parent's method");
	}

	class Child{
		private String string2="child";
		
		public void display2(){
			System.out.println(string);
			System.out.println("In Child's Method");
		}
	}
}

class Driver{
	public static void main(String...a){
		Parent ob=new Parent();
		Parent.Child ob2=ob.new Child();
		System.out.println("Calling child using parent Object");
		ob.display();
		ob2.display2();
	}		
}						

	