class Class1{
	public Class1(){
		System.out.println("Hi from class1");
	}
	class Class1{
	public Class1(){
		System.out.println("Hi from duplicate class 1");
	}
}
}
class Run{
	public static void main(String args[]){
		Class1 ob=new Class1();
		Class1.Class1 oj=ob.new Class1();
	}
}
		
	