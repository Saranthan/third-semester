class A{
	
}

class Main{
	public static void main(String...a){
		A ob=new A();
		A ob2=new A();
		System.out.println("using == : "+(ob==ob2)); //false
		System.out.println("Using equals method : "+ob.equals(ob2)); //false
	}
}