import java.util.Scanner;
public class Palindrome {
    public static void main(String...a){
        String s=new Scanner(System.in).nextLine();
        if(isPalindrome(s)){
            System.out.println("The given String is a Palindrome");
        }else{
            System.out.println("The given String is not a palindrome");
        }
    }
    public static boolean isPalindrome(String a){
        int s=0;
        int e=a.length()-1;
        while(s<=e){
            if(a.charAt(s)!=a.charAt((e))) {
                return false;
            }
            s++;
            e--;
        }
        return true;
    }
}
