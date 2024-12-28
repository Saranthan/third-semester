//java program for binary search 
import java.util.Arrays;


class Main{
	public static void main(String...a){
		int arr[]={4,3,2,6,5,12,10};
		int key=10;
		int start=0,stop=arr.length-1;
		Arrays.sort(arr);
		System.out.println(arr);
		while(start<=stop){
			int mid=(start+stop)/2;
			if(key==arr[mid]){
				System.out.println("The key is found at : "+mid);
				break;
			}else if(key<arr[mid]){
				stop=mid-1;
			 }else
				start=mid+1;
		}
		System.out.println("Key not found");
	}
}