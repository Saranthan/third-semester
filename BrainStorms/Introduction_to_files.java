//java program tot test various io Streams in java 

import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
class MyFile{
	
	public static void main(String...args){
		File myfile=new File("d:\\javap\\Tharane.txt");
		System.out.println("Your file has been opened");
		if(myfile.exists()){
			System.out.println("Your file is present");
		}
		else{
			myfile.createNewFile();
			System.out.println("I have created a new file");
		}
	}
}