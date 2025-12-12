class Datatype{
	public static void main(String args[]){
	int a=65536;
	 long b=(long)a;
	System.out.println(a);
	System.out.println(b);
  }
}
class Char{
	int a='c';
	void display(){
		System.out.println("Hello : "+a);
	}
	public static void main(String args[]){
	  Char a=new Char();
	  a.display();
	
    }
}
class Global{
	int a=100;
	public void print(){
		System.out.println("A : "+a);
   }
	public static void main(String args[]){
	Global a=new Global();
	a.print();
	}
}