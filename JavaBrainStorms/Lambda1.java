//java program to showcase the use of lambda expression

interface Operations{

	public int operations(int x,int y); //note only one abstract method can be used in lambda expressions
	default void print(){ // ofcourse there can be a concrete method 
		System.out.println("Hi from default method");
	}
}

class Main {
	public static void main(String...args){
		Operations add=(a,b) ->(a+b);
		Operations sub=(a,b) ->(a-b);
		Operations mul=(a,b)->(a*b);
		Operations div=(a,b)->(a/b);
		System.out.println();
		System.out.println("Adding using lambda exp : "+add.operations(100,200));
		System.out.println("Subracting using lambda exp : "+sub.operations(200,100));
		System.out.println("Multiplication using lambda exp : "+mul.operations(200,100));
		System.out.println("Division using lambda exp : "+div.operations(100,10));	
	
	}
}