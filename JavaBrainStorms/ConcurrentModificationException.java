//java	program to show an example for concurrent modification Exception 

import java.util.ArrayList;
import java.util.Iterator;

class Main{

	public static void main(String...a){
		ArrayList<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		for(int i:list){
			if(i==2)
				list.remove(i); // ConcurrentModifictionException will be thrown at this point....
 			}
		}
	}	
