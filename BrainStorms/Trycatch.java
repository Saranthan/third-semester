//java program to demonsttrate the use of try catch block in java

class Main{
	public static void main(String...a){
		try {
		  int c=1/0;
		}catch (Exception e){
			System.out.println(e.getMessage());
		}
	}
}