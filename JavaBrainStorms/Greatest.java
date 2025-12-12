import java.util.Scanner;
class G2{	
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number a : ");
	int a=sc.nextInt();
	System.out.println("Enter the number B : ");
	int b=sc.nextInt();
	int c=a>b?a:b;
	System.out.println("Largest number is : "+c);
  }
}
class G3 {
	public static void main(String args[]){
	int a=10;
	int b=20;
	int c=30;
	int res=(a>b)?(a>c?a:c):(b>c?b:c);
	System.out.println(res);
}
}
		