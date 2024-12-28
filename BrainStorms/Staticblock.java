class Main{
	
	static {  //static block is always executed once even though multiple objects are created..

		System.out.println("Static block 1");
	}
	static {     //both second block and first block are executed 
		
		System.out.println("Static block 2");
	}
}
class Run{
	public static void main(String...a){

		Main ob=new Main();  // Once object is create only one time is executed 

		Main obj=new Main(); // Calling second time to test the execution of static block..
	}

}