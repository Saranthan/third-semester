import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;


class Write{

	static FileWriter fr=null;
	static Scanner sc;

	public static void main(String...args) throws IOException,InterruptedException{	
	
		try{
		sc=new Scanner(System.in);
		File f=new File("tharane.txt");
		fr=new FileWriter(f);
		System.out.println("Enter the content you want to write in file : ");
		String data=sc.nextLine();
		System.out.println("Writing data please wait ");
		Thread.sleep(5000);
		fr.write(data);
		System.out.println("Content written successfully");
		}catch(IOException e){
			System.out.println(e.getMessage());
		}catch(InterruptedException e1){
			System.out.println(e1.getMessage());
		}
		
	}
}