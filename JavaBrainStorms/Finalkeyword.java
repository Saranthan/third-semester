
// Java program to illustrate the feature of Final keyword in java

class Final{
	final double pi=3.14;
	public void print(){
		System.out.println("Changing the value of pi");

		pi=6.14; // Error cannot modify a final variable

		System.out.println("Changing the value of "+pi);
	}
}
class Run{
	public static void main(String args[]){
		Final ob=new Final();
		ob.print();
		System.out.println("Instance value"+ob.pi);
	}
}

	