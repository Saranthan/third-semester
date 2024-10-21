class Staticandnonstatic
{
	static String s1="tharane";
	String s2="tharane2"; //Non-static field...
		
	public static void display(){ // A static method can only acccess static fields...
		Staticandnonstatic inner=new Staticandnonstatic();
		System.out.println("Printing non static field s2 : "+inner.s2);		
		System.out.println("printing staic field : "+s1);
		System.out.println();
		//System.out.println("Prinitng non static field : "+s2);  //error non static field cannot refferd from a static context...
	}
}

class Driver{
	public static void main(String...a){
		Staticandnonstatic ob=new Staticandnonstatic();
		ob.display();
	}
}		