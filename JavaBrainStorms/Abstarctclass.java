abstract class Atm{
	abstract public void balance();
	// abstract int a; // this will cause compliation error since abstract keyword cannot be used near variables

public static void main(String args[]){ 

	//Atm ob1=new Atm();   // abstarct class cannot be instantiated
    }
}

class Logic extends Atm{

	public void balance(){
	System.out.println("Hi from balance");
	} 

	public static void main(String args[]){

		Logic ob=new Logic();   // creating the extended Class for abstract class
		Atm ob=new Atm();     // Even after implementing all the absract identifers abstract class still cannot be instantiated..
		ob.balance();
	}
}
