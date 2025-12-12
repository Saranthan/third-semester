//java program to show the working of Wrapper classes;

class Wrapper{
	public static void main(String...args){
		int a =100;
		Integer ab=a; //AutoBoxing..

		Integer ba=new Integer(1000); //Traditonal Boxing;..
	
		int primitiveint=ba.intValue(); //Tradional unboxing using intValue() method..
					
		int b=ab; //AutoUnboxing..
		
		System.out.println("The Integer object's value is (autoboxing) :"+ab);

		System.out.println("The Integer value of b through autounboxing is "+b);
	}
}

