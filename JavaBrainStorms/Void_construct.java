// java program to check if the constructor can have return type of void 

class Cons{
	void Cons() { 
		//if any return type is mentioned the Constructor will be treated as a method
		System.out.println("Constructor called");
	}
}

class Main{
	public static void main(String...a){
		Cons ob=new Cons();
	}
}