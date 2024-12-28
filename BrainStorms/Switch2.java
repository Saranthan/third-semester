//Java Program to simulate the use of switch case

class Main {
	public static void main(String...args){
		int a=11;
		switch(a) {  //Switch variable a directly...
			case 1:
				System.out.println("One");
				break;
			case 2:
				System.out.println("Two");
				break;
			case 10:
				System.out.println("Ten");
				break;
			default:		//Default will be called if every test case fails.. 
				System.out.println("Default called");
				break;
		}
	}
}