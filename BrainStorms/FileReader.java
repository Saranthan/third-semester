import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

class Main{
	static FileReader fr=null;
	static BufferedReader br=null;
	public static void main(String...a) throws IOException,InterruptedException{
		fr=new FileReader("Tharane.txt");
		br=new BufferedReader(fr);
		String s=br.readLine();
		while(s!=null){
			Thread.sleep(200);
			System.out.print(s+" ");
			s=br.readLine();
		}
		System.out.println();
		System.out.println("FileReading complete");
	}
}
		