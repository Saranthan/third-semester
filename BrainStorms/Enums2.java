//java program to showcase the use case of enums in java

class EnumExample{
	enum Weeks{
		Monday("Hi i am monday"),tuesday("Hi i am tuesday"),wednesday("Hi I amwednessday"),thursday("Hi I am thrusday"),friday("Hi I am friday"),saturday("Hi i am saturday"),sunday("Hi I am sunday");

		private String st;
		Weeks(String msg){
			this.st=msg;
		}
		public String getMessage(){
			return st;
		}
	}
	public static void main(String...a){
		
		Weeks week;
		week=Weeks.Monday;
		System.out.println(week.Monday);
		System.out.println("The enum constant's message is "+week.getMessage());


	}
}