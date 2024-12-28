//ava program to show that a default method in interface is always final..	

interface remote{
	default void turnon(){
		System.out.println("Turning o tv");
	}
	void turnoff();
}


class Tv implements remote{
	
	public void turnoff(){	
		System.out.println("Turning off tv");
	
	}	
	public  void turnon(){
		System.out.println("Turning on tv");
	}

	public static void main(String...a){
		remote ob=new Tv();
		ob.turnon();
	}

}		