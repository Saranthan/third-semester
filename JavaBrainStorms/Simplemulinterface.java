interface one { 	//interface one

	int a1=10;		//interface field a1

	void print_one(); 	//abstarct method printone()

}
interface two {			//interface two

	int b=20; 		//interface field b
				
	void print_two();	//abstarct void print_two()
}
class Main implements one,two {   //Implementing one and two interfaces...

	public void print_one(){

		System.out.println("Printing one");
	}

	public void print_two(){
	
		System.out.println("Printing two");
	}

public static void main(String...a){

	Main ob=new Main();		//creating object
	System.out.println("a1 :"+a1);	//printing field of interface 1
	System.out.println("b : "+b);	//printing field of interface 2
	ob.print_one();			//printing method 1 
 	ob.print_two();			//printing method 2

  }
}
