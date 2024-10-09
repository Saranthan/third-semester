import java.util.*;
interface Account1
{
   void deposite(double amount);
}
interface Account2
{ 
   void withdraw(double amount);
  // double calculate Interest();
   //double checkBallance();
}
class SavingsAccount implements Account1,Account2
{
   public static double balance;
   public double rent;
   public void Savings( double balance,double rent)
      {
       this.balance=balance;
       this.rent=rent;
      }
   public void deposite(double amount)
  {
      balance+=amount;  
     System.out.println("The Balance is: "+ balance);
    

   }
   public void withdraw (double amount)
   {
      if(balance>=amount)
     {    

          System.out.println("whithdraw amount is :"+ amount );
          this.balance-=amount;
          System.out.println("Balance amount from withdrawed amount: "+balance);
          double needed=balance*rent;
          System.out.println("The rent to check the Balance: " + needed );
          double need=balance-needed;
          System.out.println("The balance from the rent is: "+need );
     }
       else
     {
          System.out.println("Insufficent balance");
     }


}

   public static void main(String [] arr)
   {
     	SavingsAccount obj= new SavingsAccount();
        obj.Savings(20000.0,0.01);
        System.out.println("Balance : "+balance);
        obj.withdraw(100.0);      
        obj.deposite(2000.0);
       
   }


}