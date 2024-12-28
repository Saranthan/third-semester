import java.util.Scanner;
public class SumofDigits {
        static int sum=0;
    public static void main(String...a){
        int number;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        number=sc.nextInt();
        String[] arr=Integer.toString(number).split("");
        for(String i:arr){
            sum=sum+Integer.valueOf(i);
        }
        System.out.println("The sum of digits is :"+sum);
    }
}
