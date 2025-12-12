//java program to reverse a String
import java.util.Scanner;

class ReverseStr{
	static Scanner sc;
	public static void main(String...args){
		sc=new Scanner(System.in);
		System.out.println("Enter the String to be reversed : ");
		String string=sc.nextLine();
		StringBuilder str=new StringBuilder(); //creating String builder class
		for(int i=string.length()-1;i>=0;i--){
			str.append(string.charAt(i));
		}
		System.out.println("String reversed..");
		System.out.println(str.toString());
	}
}
			
			