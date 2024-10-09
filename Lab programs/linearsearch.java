class linearsearch{
public static void main(String[] args){
int[] arr = {10,20,30,40,50,60,70};
int key = 70;		
for (int i =0; i<arr.length; i++)
{
if(arr[i]==key){
System.out.println("Key found at position: " + i);
}
}
}
}