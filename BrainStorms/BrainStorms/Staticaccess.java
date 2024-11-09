class Main{
	int b;
	public static void main(String...a){	
		//System.out.println(b); non static variables cannot be accesed inside static method...
	}
}
class Viceversa{
	static int c=10;
	void disp(){
		System.out.println(c); //non static method can access static variable
	}
}