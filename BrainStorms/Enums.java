//java program yo showcase the use of enums in java.
	
class Main{
	enum Gender{ //enums are just a classes that handle constant values to ensure type saftey../

		Male,Female; //basically just declare your constants here../

		//The default memeber of enum constants are public static final members just like Interface character/
	}

	public static void main(String...a){
		Gender gen=Gender.Male; //here in enums no need to specifially initliaze with ew variable
		System.out.println(gen); //here it the jvm just prints the associated initlaized value..
	}

}	