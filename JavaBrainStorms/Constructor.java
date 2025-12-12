class Constructor{
	public Constructor(){
		System.out.println("Void constructor Initalized");
	}
	public Constructor(String s){
		System.out.println("String constructor Initalized"+s);
	}
	public Constructor(String s,int i){
		System.out.println("String and integer constructor Initalized"+s+" "+i);
	}
	public Constructor(int i){
		System.out.println("int constructor Initalized i");
	}
}
class Run{
	public static void main(String args[]){
		Constructor ob1=new Constructor();
		Constructor ob2=new Constructor("Minus one");
		Constructor ob3=new Constructor("Minus one",10);
		Constructor ob4=new Constructor(10);
}
}