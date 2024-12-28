//java program to check whether a give String is a palindrome or not
import java.util.Scanner; 

class Palindrome{
	static Scanner sc;
	public static void main(String...args){
		sc=new Scanner(System.in);
		System.out.println("Enter the string to be checked : ");
		String string=sc.nextLine();
		StringBuilder str1=new StringBuilder(string);
		str1.reverse();
		if(string.equals(str1))
			System.out.println("You string is a palindrome ");
		else
			System.out.println("You string is not a Palindrome");
	}
}
		
