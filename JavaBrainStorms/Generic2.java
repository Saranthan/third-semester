//java program to show generic method

class Generic2{
	
	public <T> void printArray(T[] arr){	
		for(T ele : arr){
			System.out.print(ele+" ");
		}
	}
}

class Driver{
	public static void main(String...a){
		Generic2 ob=new Generic2();
		Integer arr[]={10,20,30,40};
		ob.printArray(arr);
		
	}
}