import java.util.Scanner;
public class Prime {
    public static void main(String...a){
        System.out.println("Enter a number");
        int n=new Scanner(System.in).nextInt();
        if(isPrime(n)) {
            System.out.println("The number is a prime number");
        }else{
            System.out.println("The number is not a prime number");
        }
    }
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) {
                return false;
            }
        }
        return true;
    }
}
