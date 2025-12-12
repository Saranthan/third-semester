class Staticandnonstatic
{
	static String s1="tharane";
	String s2="tharane2";
		
	public void display(){ // note : every non static and static method can be accessed inside the method...
						
		System.out.println("printing staic field : "+s1);
		System.out.println();
		System.out.println("Prinitng non static field : "+s2);
	}
}

class Driver{
	public static void main(String...a){
		Staticandnonstatic ob=new Staticandnonstatic();
		ob.display();
	}
}		