//to debug questions 

class Main{
public static void main(String...a){
	String s1="Tharane";
	String s2="Tharane";
	System.out.println("Checking before assigning to refernce : "+s1==s2);
	String s3="Tharane";
	String s4=s3;
	System.out.println("Checking after changing the reference : "+(s3==s4));
	}
}