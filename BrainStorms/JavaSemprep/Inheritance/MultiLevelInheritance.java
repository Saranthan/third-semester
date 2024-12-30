package Inheritance;

public class MultiLevelInheritance {
    public static void main(String[] args){
        C ob=new C();
        ob.displayA();
        ob.display();
        ob.display3();
    }
}
class A{
    int a=10;

    public A(){
        System.out.println("class A constructor");
    }

    public void displayA(){
        System.out.println("The value of a is :"+a);
    }

}
class B extends A{
    int b=0;

    public B(){
        super();
        System.out.println("At constructor B");
    }

    public void display(){
        System.out.println("The value of a is : "+a);
        System.out.println("The value of b is : "+b);
    }
}
class C extends B{
    int c=100;

    public C(){
        super();
        System.out.println("At constructor C");
    }

    public void display3(){
        System.out.println("The value is a is  "+a);
        System.out.println("The value of b is  "+b);
        System.out.println("The value of c is  "+c);
    }
}