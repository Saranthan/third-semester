import java.util.Scanner;

abstract class Calculator{

	Scanner sc;

	public Calculator(){
		Scanner sc=new Scanner(System.in);
	}
	
	abstract void add();
	abstract void sub();
	abstract void mul();
	abstract void div();
	abstract void square();
}
	
