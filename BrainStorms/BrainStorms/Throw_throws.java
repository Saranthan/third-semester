//program to show the the working flow of throw and throws
import java.util.Scanner;
class NoMatchException extends Exception{
	public NoMatchException(String message){
		super(message);
	}
}
class Main{
	Scanner sc;
	public Main(){
		sc=new Scanner(System.in);
		System.out.println("Constructor of the main class initialized");
	}
	
	void check(String s) throws NoMatchException{
		if(s=="CSBS"){
			System.out.println(s);
			System.out.println("if block executed !");
		}else
			throw new NoMatchException("No match in String....");
	}
		
	public static void main(String...a){
		Main ob=new Main();
		System.out.println("Enter any String : ");
		string s=sc.nextLine();
		try{
			ob.check(string);
		}catch(NoMatchException e){
			System.out.println(e.getMessage());
		}
	}
}