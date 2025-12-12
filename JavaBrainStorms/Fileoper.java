import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

class Fileoper{
		
	//there will be always an default constructor if explicit cons was not mentioned..
	Scanner sc;
	File fob;
	FileInputStream fis;
	FileOutputStream fos;

	FileOper(){
		fis=null;
		fos=null;
		sc=new Scanner(System.in);
	}

	public void createNewFile1() throws IOException{

		fob=new File("Tharane2.txt");

		if(fob.createNewFile())
			System.out.println("Your file "+fob.getName()+" has been Created");
		else
			throw new IOException("Your file exists already");

	}
	
	public void readContent(String filename) throws FileNotFoundException,IOException{

		fis=new FileInputStream(filename);
		System.out.println("file got initialized ");
		int d=fis.read();
		try{
		while(d!=-1){
			System.out.print((char) d);
			Thread.sleep(100);
			d=fis.read();
		}
		System.out.println();
		System.out.println("File reading complete");
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
	public static void main(String...a){
		Fileoper ob=new Fileoper();
		/*
		try{
		ob.createNewFile1();
		}catch(IOException e){
			System.out.println(e.getMessage());
		}
		*/
		try{
			ob.readContent("tharane2.txt");
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}		
}
