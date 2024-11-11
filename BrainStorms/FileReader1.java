//java program to rewrite using Character stream ...

import java.io.FileReader;
import java.io.File;
import java.io.IOException;
class Main{

	public static void main(String...a) throws IOException,InterruptedException{
	File file=new File("d:\\javap\\Tharane.txt");
	FileReader fr=new FileReader(file);
	int c=fr.read();
	while(c!=-1){
		Thread.sleep(200);
		System.out.print((char) c);
		c=fr.read();
	}	
	System.out.println();
	System.out.println("File readed successfully");

	}
}