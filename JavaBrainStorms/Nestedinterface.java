//Java program to show nested Interface

	
interface Parent{
	interface Child{
		void Child();
	}
	void Parent();
}

class Main implements Parent.Child,Parent{
	public void Child(){
		System.out.println("Child...");
	}
	
	public void Parent(){
		System.out.println("Parent..");
	}
}

class Run{
	public static void main(String...a){
		Parent.Child ob=new Main(); // Creating object for inner interface
		Parent obj=new Main();    //Creating object for outer interface
		obj.Parent(); 		//Calling Parent method
		ob.Child();		//Calling Child method
	}
}