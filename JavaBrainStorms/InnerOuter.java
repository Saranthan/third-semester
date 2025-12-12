class Outer{
	String a;
	class Inner{
		String c;
	public void display(){
		System.out.println("Inside Inner class");
	}
    }
    public void display(){
		System.out.println("bye");
  }
}
class Run{
	public static void main(String ar[]){
		Outer obj=new Outer();
		Outer.Inner ob=obj.new Inner();
		obj.display();
		ob.display();
}
}