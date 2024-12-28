class Main{
	int volume;
	interface tv{
		void volumeup(int n);
	}
}
 
class Main2 extends Main implements Main.tv{
	public void volumeup(int n){
		volume+=n;
	}
	void display(){
		System.out.println("Volume is "+volume);
	}
}

class Run{
	public static void main(String...a){
		Main.tv ob=new Main2(); //Since there's an interface refernce we need to typecast ob to main to call display();
		ob.volumeup(12);
		((Main2) ob).display(); //Type casting happens..
		System.out.println();
 
		Main2 ob1=new Main2(); //Inorder to avoid complexity we can directly create object for the main class.
		ob1.volumeup(100);
		ob1.display();
		
	}
}
			