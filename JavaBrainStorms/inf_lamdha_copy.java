//java program to showcase the functioning of lamdha 

interface inf{
	public void println();
}

class Main{
	public static void main(String...a){

	inf ob=()->System.out.println("Hi I am implemented using lambdha");
	ob.println();


	inf ob2=()->System.out.println("Hi I am secind method implemented using lambdha ");
	ob2.println(); 
     }
}