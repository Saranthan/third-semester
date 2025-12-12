// Java snippet to understand the functing of long data type

class Main{
	
	public static void main(String...a) {

		Long i=10l; 	//For long with wrapper object explicit conversion is mandatory..

		System.out.println("Wrapper object long"+i);

		long k=10; 	//implicit conversion happens here and 10 becomes long implicitly.

		long k1=10l;	 //Devlopers can mention explicitly the given data is of long type by L or l at end.

				//note : L is used mostly as there occurs readablity issues when l is used...

		System.out.println("Primitive object long K1 "+k1);
	 

		System.out.println("Primitive object long  K "+k);

				

	 }
}
		