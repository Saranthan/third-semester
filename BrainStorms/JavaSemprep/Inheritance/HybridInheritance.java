package Inheritance;

public class HybridInheritance {
    public static void main(String...args){
        Main3 ob=new Main3();
        ob.display();
        Main2 ob2=new Main2();
        ob2.display();
        Main3 ob3=new Main3();
    }
}
class Main{
    int  a=10 ;
    public void display(){
        System.out.println(" The value of a is "+a);
    }
}


class Main2 extends Main{

    int b=a*00;

    public void display(){
        System.out.println("The value of b is "+b);
    }

}

class Main3 extends Main{
    int c=a*20;

    public void display(){
        System.out.println("The value of c is : "+c);
    }
}