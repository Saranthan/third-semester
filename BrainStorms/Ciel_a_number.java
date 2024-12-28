import java.util.Scanner;

class Main{
	public static void main(String...args){
		System.out.println("Enter the number in float value : "); 
		float num=new Scanner(System.in).nextFloat();
		System.out.println("The ciel value of num is : "+(num==(int) num?(int)(num):(int) (++num)));
	}
}	