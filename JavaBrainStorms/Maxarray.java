class Max{
	public static void main(String args[]){	
		int[] arr={1,2,3,4,5,6};
		int max=0;
		for(int i:arr){
			if(i>max)
			  max=i;
		}
		System.out.println("Maximum element in array is "+max);
	}
}
class Min{	
	public static void main(String args[]){
		int[] arr={1,2,3,4,5,6};
		int min=arr[0];
		for(int i=1;i<arr.length;i++){	
			if(arr[i]<min)
				min=arr[i];
		}
		System.out.println("Minimum element in array is "+min);
  }
}