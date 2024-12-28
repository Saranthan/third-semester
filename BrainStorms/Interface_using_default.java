interface Tharane{
	default void print() { 		//Inorder to have Concrete methods the access specifier must be default
		System.out.println("print...");
	}
	default void hello(){
		System.out.println("Hello...");
	}
	void helloworld();
}

class Main implements Tharane{
	public void helloworld() {

		System.out.println("Helloworld");
	}
	public static void main(String...a){

	Tharane ob=new Main();
	ob.hello();
	ob.print();
    }
}