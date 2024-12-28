import java.util.Scanner;
class Getip{
	int n;
	int[] arr;
	int ele;
	Scanner sc;
	public Getip(){
		System.out.println("Enter the number of elements");
		sc=new Scanner(System.in);
		n=sc.nextInt();
		arr=new int[n];
		for(int i=0;i<arr.length;i++){
			System.out.println("Enter the element "+i);
			ele=sc.nextInt();
			arr[i]=ele;
		}
		System.out.println("array registered");
	}
}
class Run{
	public static void main(String args[]){
		Getip ob=new Getip();
	}
}