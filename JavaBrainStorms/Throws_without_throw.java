//java program to show throws without throw

class InputException extends Exception{
	InputException(String message){
		super(message);
	}
}

class Validate{
	public static void input(String ip) throws InputException{
		if(ip.equals("TRUE"))
			System.out.println("Good to go");
		else
			System.out.println("Not good to go");
	}
}

class Main{
	public static void main(String...a){
		Validate ob=new Validate();
		try{
		ob.input("NOT true");
		}catch(InputException e){
			e.printStackTrace();
		}
	}
}