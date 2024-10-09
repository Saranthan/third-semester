class Main{
	public static void main(String...arg){
		int arr[]=new int[10];
		try{
			int b=1/0;
			//arr[11]=100;
		}
		catch(ArrayIndexOutOfBoundsException b){
			System.out.println("Array size comprimised at "+b.getMessage());
		}catch(ArithmeticException c){
			System.out.println("Invalid operation done "+c.getMessage());
		}
	}
}