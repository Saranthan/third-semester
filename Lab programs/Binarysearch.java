import java.util.Scanner;
class Binarysearch{
	Scanner sc;
	int arr[];
	int key;
	int res;
	public Binarysearch(){
		Scanner sc=new Scanner(System.in);
		System.out.println();
		System.out.println("          Initial array"+"\n");
		int[] arr={1,2,3,4,5,6,7,8,9};
		for(int i:arr){
		System.out.print(i+" ");
	 	}
		System.out.println();
		System.out.println("---------------------------------");
		System.out.println("Enter the key to be found : ");
		int key=sc.nextInt();
		//System.out.println("constructor initialized ");
		int res=find(arr,key);
		System.out.println();
		System.out.println("Element found at "+res);
		System.out.println("---------------------------------");

	}
	public int find(int[] arr,int key){
		int start=0;
		int stop=arr.length-1;
		while(start<=stop){
			int mid=(start+stop)/2;
			if(key==arr[mid])
			    return mid;
			else if(key<=arr[mid])
				stop=mid-1;
			else
				start=mid+1;			
		}
		return -1;
	}
}
class Run{
public static void main(String args[]){
	Binarysearch ob=new Binarysearch();
  }	
}