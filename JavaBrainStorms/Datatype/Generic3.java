//java Generic type extension 

class Sample<T extends Number>{

	T var ;

	public void print(){
		System.out.println("Printing : "+var);
	}

}

class Main{
	
	public static void main(String...a){
	
		Sample<Integer> ob=new Sample<Integer>(10);
		ob.print();
	}
} 	