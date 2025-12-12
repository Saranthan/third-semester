import java.util.Scanner;
class Prime{
	static boolean flag;
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Number : ");
	int n=sc.nextInt();
	if(n==1){
		  System.out.println("Not a prime");
		  return;
		}	
	for(int i=2;i<=Math.sqrt(n);i++){
		if(n%i==0){
		   flag=false;
		   break;
		}else
		   flag=true;
	}
	if(flag){
	 System.out.println("The given number is a Prime");
	}else{
	  System.out.println("The given number is not Prime");
	}
  }
}		
		 