package mypackage;

import java.util.Scanner;

public class Database extends Sql_basic {
    int sno;
    long account_number;
    String name, branch_name, bank, account_type;
    private Scanner sc; // Declare scanner here

    public Database() {
        sc = new Scanner(System.in); // Initialize scanner
        collectData();
        System.out.println("Values obtained successfully");
	System.out.println();
        push(sno, name, account_number, branch_name, bank, account_type); // Pass collected values directly
    }

    private void collectData() {
        System.out.println("Enter the serial number: ");
	System.out.println();
        sno = sc.nextInt();
        System.out.println("Enter the name of the accountee: ");
	System.out.println();
        sc.nextLine(); // Consume newline
        name = sc.nextLine();
        System.out.println("Enter the account number of the accountee: ");
	System.out.println();
        account_number = sc.nextLong();
        sc.nextLine(); // Consume newline
        System.out.println("Enter the branch name: ");
	System.out.println();
        branch_name = sc.nextLine();
        System.out.println("Enter the bank name of the accountee: ");
	System.out.println();
        bank = sc.nextLine();
        System.out.println("Enter the account type of the accountee: ");
	System.out.println();
        account_type = sc.nextLine();
    }

    public void push(int sno, String name, long account_number, String branch_name, String bank, String account_type) {
        // Corrected SQL query
        String query = "INSERT INTO CBS (SNO,Name,Account_number,Branch,Bank,Account_type) VALUES (?, ?, ?, ?, ?, ?)";
        Sql_basic obj = new Sql_basic(); // Create an instance of Sql_basic
        obj.executeQuery(query, sno, name, account_number, branch_name, bank, account_type); // Pass parameters directly
        obj.closeConnection(); // Close the connection when done
    }

    public static void main(String... a) {
        new Database(); // Instantiate Database to run the constructor
    }
}
