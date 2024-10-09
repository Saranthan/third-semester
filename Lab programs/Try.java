class Try{
	public static void main(String...a){
		int arr[]=new int[5];
		try {
		     arr[9]=10;
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array index is out of boundary "+e.getMessage());
		
		}
	}
}
