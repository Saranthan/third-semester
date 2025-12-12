public class PassingObjects {
    PassingObjects ob;
    int a;
    String name;
    public PassingObjects(int a,String name){
        this.a=a;
        this.name=name;
    }
    public void setObject(PassingObjects externalobject){
        this.ob=externalobject;
    }
    public void display() {
        System.out.println(a);
        System.out.println(name);
        if (ob != null) {
            System.out.println("Current object a is : " + ob.a);
            System.out.println("Current object name is :" + ob.name);
        }
    }
    public static void main(String[] args){
        PassingObjects ob1=new PassingObjects(10,"Tharane");
        ob1.display();
        PassingObjects ob2=new PassingObjects(101,"Sabari");
        ob1.setObject(ob2);
        ob1.display();
    }
}
