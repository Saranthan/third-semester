//java program to convert into the byte

class Main{
	public static void main(String...args){
	
		int a=260;
		Byte b=(byte) a;
		int c=b; 	//explicit conversion takes place here...
		System.out.println("Byte value of explicit conversion is "+b);
                System.out.println("The maximum value of byte is "+Byte.MAX_VALUE);
		System.out.println("The minum value of byte is "+Byte.MIN_VALUE);
		System.out.println("The value of c is "+c); 
	}
} 