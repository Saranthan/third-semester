public class ExceptionExample {
    //basic types of exception in java
    // 1. Checked Exceptions
    // 2. Unchecked Exceptions
    // 3. Error.
    public static void main(String...a){
        showCheckedException(); //calling showCheckedException
    }
    public static void showUncheckedException(){
        try {
            int arr[] = {1, 2, 3, 4, 45};
            System.out.println(arr[100]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Example of an Unchecked Exception : ArrayIndexOutOFBoundsException");
        }
    }
    public static void showCheckedException(){
        try{
            int a=10/0; //showing checked Exception
        }catch(ArithmeticException e){
            System.out.println("Caught Arithimetic Exception ");
        }
    }
    public static void showError(){
        System.out.println("Example of an error is :");
        System.out.println("Out Of Memory Error");
    }
}
