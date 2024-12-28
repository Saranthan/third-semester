import java.util.Scanner;

class Postivexception extends Exception{
	public Postivexception(String message){
		super(message);
	}
}

class Main {
	static void validate(int n) throws Postivexception{
		if(n<0)
			throw new Postivexception("number must be greater than Zero");
		else
			System.out.println("You are good to go");
	}
	public static void main(String...args){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		try{
		validate(a);
		}catch(Postivexception e){
			System.out.println(e.getMessage());
		}
	}
}	