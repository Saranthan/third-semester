import java.util.Scanner;
public class SearchingAlgorithims {

    static Scanner sc;

    public static void main(String...a){
        sc = new Scanner(System.in);
        int[] arr=getArray();
        int target=sc.nextInt();
        int res=binarySearch(arr,target);
        if(res!=-1){
            System.out.println("Element found at index : "+(res));
        }else{
            System.out.println("Element not found");
        }
    }
    public static int[] getArray(){
        System.out.println("Enter the number of elements to be in array : ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) {
            System.out.println("Enter element" + (i + 1) + ":");
            arr[i] = sc.nextInt();
        }
        System.out.println("Array loading complete");
        return arr;
    }
    public static int binarySearch(int[] a,int target){
        int start=0;
        int stop=a.length-1;
        while(start<=stop){
            int mid=start+(stop-start)/2;
            if(target==a[mid]){
                return mid;
            }
            else if(target<mid){
                stop=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
    public static int linearsearch(int[] a,int target){
        int index=-1;
        for(int i=0;i<a.length;i++){
            if(a[i]==target){
                index=i;
                break;
            }
        }
        return index;
    }
}
