//java program to write the content some content into the file
import java.io.*;
import java.util.Scanner;
class Main{
	static FileOutputStream fos =null;
	static Scanner sc;
	public static void main(String...a) throws IOException{		
		fos=new FileOutputStream("Tharane.txt");
		System.out.println("File opened sucessfully");
		sc=new Scanner(System.in);
		String s=sc.nextLine();
		fos.write(s.getBytes());
		System.out.println("Content writing into the file is success..");
		fos.close();
	}
}