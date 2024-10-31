//java program to showcase the working of filehandling...
import java.io.*;


class Main{
	public static void main(String...a) throws IOException{	
		File ob=new File("Tharane.txt");
		if(ob.createNewFile()){
			System.out.println("New fie created..");
		}else{
			System.out.println("File already exists...");
		}
	}
}