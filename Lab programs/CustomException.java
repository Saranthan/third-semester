//Java program to simulate Custom exception

import java.util.Scanner;
class Even extends Exception{
   	public Even(String m){
	super(message);
	}
}

class Main{
	
	public static void main(String...arg){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		Main ob=new Main();
		ob.validate(a);
	}

	public void validate(int n) throws Even{
		if(n%2!=0){
			throw new Even("Number must me a even");
		}else
			System.out.println("You are good to go !");
	}			
}