//java program to To read string from file

import java.io.IOException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
class Main2{
	
	public static void main(String...a) throws IOException,InterruptedException{
		BufferedReader br=new BufferedReader(new FileReader("d:\\javap\\Tharane.txt"));
		String str=br.readLine();
		while(str!=null){
			Thread.sleep(3000);
			System.out.println(str);
			str=br.readLine();
		}
		System.out.println();
		System.out.println("File reading complete..");
	}
}
		
		