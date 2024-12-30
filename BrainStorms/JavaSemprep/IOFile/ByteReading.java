package IOFile;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.File;

 /*
    //Thread belongs to java.lang.Thread
    //it is accessible without import statment or any extension.
    File IO Operations
        1.Using Byte Stream
        2.Using Character Stream
        Character Stream is an abstarct version of byte which makes it easier to implement
  */
public class ByteReading {
    static FileInputStream fis;

    public static void main(String...a) throws IOException,InterruptedException{
        fis=new FileInputStream(new File("D:\\semprep\\BrainStorms\\JavaSemprep\\IOFile\\source.txt"));
        int d=fis.read();
        while(d!=-1){
            Thread.sleep(100);
            System.out.print((char) d);
            d=fis.read();
        }
        System.out.println();
        System.out.println("File reading complete...");
    }
}
