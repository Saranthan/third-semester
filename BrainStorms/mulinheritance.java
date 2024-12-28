interface a1{
	void hello1();
}

interface a2{
	void hello2();
}

class Main implements a1,a2{
	public void hello1(){
		System.out.println("hello1");
	}

	public void hello2(){
		System.out.println("hello");
	}
	
	public static void main(String...a){
		Main ob=new Main();
		ob.hello1();
	}
	
}		
		