package Inheritance;
//Example for single inheritance
public class SingleInheritance {
    public static void main(String...a){
        Child ob=new Child();
        ob.display2();
    }
}
class Parent{
    String parentname="SenthilKumar";
    public Parent(){
        System.out.println("parent Constructor");
    }

    public void display1(){
        System.out.println(parentname);
    }
}
class Child extends Parent{
        String name="Tharane";
        public Child(){
            super();
            System.out.println("Child Constructor");
        }
        public void display2(){
            System.out.println(parentname);
            System.out.println(name);
        }
}