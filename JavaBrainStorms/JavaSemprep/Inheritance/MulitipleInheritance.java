package Inheritance;

public class MulitipleInheritance {
    public static void main(String[] args){
        Main5 ob=new Main5();
        ob.display1();
        ob.display2();
    }
}

interface a{
    int val1=10;
    public void display1();
}

interface b{
    int val2=100;
    public void display2();
}

class Main5 implements a,b{
    public void display1(){
        System.out.println("The value of a is : "+val1);
    }
    public void display2(){
        System.out.println("The value is b is :"+val2);
    }
}