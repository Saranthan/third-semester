package IOFile;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.util.Scanner;

public class CharacterWriting {
    static BufferedWriter bw;
    static FileWriter fw;
    static Scanner sc;
    public static void main(String...a)throws IOException{
        sc=new Scanner(System.in);
        fw=new FileWriter(new File("d:\\semprep\\BrainStorms\\javaSemprep\\IOFile\\source.txt"));
        bw=new BufferedWriter(fw);
        System.out.println("Enter a line : ");
        String s=sc.nextLine();
        bw.write(s);
        bw.close();
    }
}
