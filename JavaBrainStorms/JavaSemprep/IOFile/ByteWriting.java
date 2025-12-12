package IOFile;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;




public class ByteWriting {
        static FileOutputStream fos;
        static Scanner sc;
        static char b;
    public static void main(String[] args) throws IOException{
        sc=new Scanner(System.in);
        fos=new FileOutputStream(new File("D:\\semprep\\BrainStorms\\JavaSemprep\\IOFile\\source.txt"));
        System.out.println("Enter a String : ");
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++) {
            b=s.charAt(i);
            fos.write(b);
        }
        fos.flush();
        fos.close();
        System.out.println("File writing complete");
    }
}
