public class Variableargs{

	public static void getarr(int...a) {  //set of variables can be grouped as an array.

		for(int i:a) {
			System.out.print(i+" ");
		}
	}
	
	public static void getmul(String name1,String...name) { //In case of more than one parameter in variable 								// in args the vargs should be given in as last 								// set of declarations .

		System.out.println("String variable is "+ name1);

		for(String s:name){
			System.out.print(s+" ");
		}
	}

	public static void main(String args[]) {
		System.out.println("Array is : ");
		getarr(1,2,3,4,5);
		getmul("Abhi","Sugu","Tharane");
	}

}