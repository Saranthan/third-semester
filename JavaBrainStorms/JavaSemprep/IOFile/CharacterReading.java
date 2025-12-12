package IOFile;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;

public class CharacterReading {
    static BufferedReader br;
    static FileReader fr;
    public static void main(String[] args) throws IOException{
        fr=new FileReader(new File("D:\\semprep\\BrainStorms\\JavaSemprep\\IOFile\\source.txt"));
        br=new BufferedReader(fr);
        String s=br.readLine();
        while(s!=null){
            System.out.println(s);
            s=br.readLine();
        }
        System.out.println("File reading complete");
    }
}
