import java.util.Scanner;
class Employee{
	int empid,age,basic;
	float hra,da,pf;
	double grosssalary;
	String name,designation,address,dept;
	Scanner sc;
	public Employee() {
		sc=new Scanner(System.in);
		display();
		System.out.println("\n");
		System.out.println("Enter the empid : ");
		empid=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the Name of the employee : ");
		name=sc.nextLine();
		System.out.println("Enter the age of the employee : ");
		age=sc.nextInt();
		System.out.println("Enter the designation of the employee : ");
		designation=sc.nextLine();
		sc.nextLine();
		System.out.println("Enter the address of the employee : ");
		address=sc.nextLine();
		System.out.println("Enter the department  : ");
		dept=sc.nextLine();
		System.out.println("Enter the base salary of the employee : ");
		basic=sc.nextInt();
		System.out.println("Enter the HRA  of the employee : ");
		hra=sc.nextFloat();
		System.out.println("Enter the DA salary of the employee : ");
		da=sc.nextFloat();
		System.out.println("Enter the PF of the employee : ");
		sc.nextFloat();
		grosssalary=hra+pf+basic+da;
		//System.out.println("Constructor Initialized ");
	}
	public void display(){
		System.out.println();
		System.out.println("                    PAY SLIP");
		System.out.println("##########################################################");
		System.out.println("           Employee ID : "+ empid);
		System.out.println("           Name : "+ name);
		System.out.println("           Age : "+ age);
		System.out.println("           Address : "+ address);
		System.out.println("           Base salary : "+ basic);
		System.out.println("           DA : "+ da*basic);
		System.out.println("	   HRA : "+ basic*hra);
		System.out.println("	   PF : "+ 0.12*basic);
		System.out.println("	   Department : "+ dept);
		System.out.println("	   Gross salary : "+ grosssalary);
		//System.out.println("	   Name : "+ name);
		System.out.println("##########################################################");
	}
}
class Worker extends Employee{
	public Worker() {
	super.display();
	//System.out.println("On worker's constructor ");
	//super.display();
    }	
}

class Driver{
	public static void main(String args[]){
		Worker w=new Worker();
	}
}
		
		
		
		
	