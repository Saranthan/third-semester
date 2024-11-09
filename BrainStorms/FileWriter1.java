//java program to write contents into file using rFileWriter

import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

class Main{
	FileWriter fr;
	File f;

	Main() throws IOException{
		f=new File("d:\\javap\\Tharane.txt");
		fr=new FileWriter(f);
	}

	public void writeContent() throws IOException{
		String s="HI I AM Written by JVM hahaha";

		fr.write(s);

		fr.flush(); //this is mandatory or fr.close() as it actually saves contents to file...

		System.out.println("File Writing complete");
	}

	//Driver 
	public static void main(String...a) throws IOException{
		Main ob=new Main();
		ob.writeContent();
	}
}

