//java program to show that final keyword cannot be involved 

interface Sample{
	int a1=10;
}

class Main implements Sample
{
	public static void main(String...a){

		// Sample ob=new Sample();  //Interfaces cannot be insantiated..

		Sample ob=new Main(); //Creating an object of the interface

		//ob.a1=100;   can be reassigned as interface fields are public static final in nature..

		System.out.println(a1);
	}
}