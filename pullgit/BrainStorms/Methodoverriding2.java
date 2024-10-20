//java program to showcase the method overriding

class Car{
	public void run(){
		System.out.println("Car is running");
	}
}

class Bmw extends Car{
	
	public void run(){
		System.out.println("Bmw is running ");
	}
}

class Maruthi extends Car{
	
	public void run(){
		System.out.println("Maruthi is running..");
	}
}

class Main{
	public static void main(String...a){
		
		Car car=new Bmw();
		Car car2=new Maruthi();
		car2.run();
		car.run();
	}

}