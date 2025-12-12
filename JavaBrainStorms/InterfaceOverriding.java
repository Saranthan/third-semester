//Java program to show that interface overriding

interface Hello{
	default void hello(){
		System.out.println("Hello from interface");
	}
}
class Main implements Hello{
	public void hello(){
		System.out.println("Hello from Main class");
	}
	
public static void main(String...ar){
	// Hello ob=new Main();
	Main ob=new Main(); //output hello from main class due to overridng.
	ob.hello();
	}
}