//program to show the the working flow of throw and throws

class NoMatchException extends Exception{
	public NoMatchException(String message){
		super(message);
	}
}
class Main{
	
	void check(String s) throws NoMatchException{
		if(s=="CSBS"){
			System.out.println(s);
			System.out.println("if block executed !");
		}else
			throw new NoMatchException("No match in String....");
	}
		
	public static void main(String...a){
		Main ob=new Main();
		try{
			ob.check("CSBS");
		}catch(NoMatchException e){
			System.out.println(e.getMessage());
		}
	}
}