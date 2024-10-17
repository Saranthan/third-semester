import java.util.Scanner;
	
class Main { 		//Moment the java compiler senses the presence of explicit constructor default constructor will be overrided or disabled.
	Scanner sc;
	Main(String message){
		sc=new Scanner(System.in);
		System.out.println(message);
	}
	public static void main(String...a){
		//Main ob=new Main();	//Throws error
		Main ob=new Main("String s");
	}
}
