class Main{
	public static void main(String...args){
		int[] arr={8,7,6,5,4,3,2,1};
		int target=100;
		boolean flag=false;
		int first=0;
		int last=arr.length-1;
		while(first<=last){
			int mid=first+(last-first)/2;
			if(target==arr[mid]){
				System.out.println("Element found at "+mid);
				flag=true;
				break;
			}else if(target>arr[mid]){
				last=mid-1;
			}else
				first=mid+1;
		}
		System.out.println(flag!=true?"Element not found":"Element found already");
	}
}