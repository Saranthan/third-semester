//Java program to show that even concrete methods can be present inside interfaces

interface Tharane{
	int iq=160;
	default void works(){	//After java 8 default keyword is used to have an concrete method present in an interface

		System.out.println("Won first prize as the best debugger in an event");
	}
	abstract void workshops(); // There can be abstract methods with keyword abstract if not defaultly be abstract
}


class Main implements Tharane{
	public void workshops(){
		System.out.println("Workshop in neuromorphic computing");
	}

	public static void main(String...a){
		Tharane ob=new Main();
		System.out.println(ob.iq);
		ob.works();
	}
}
		