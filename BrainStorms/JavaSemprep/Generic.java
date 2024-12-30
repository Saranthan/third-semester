
public class Generic<T> {
    /*
        Generic class  basic example
    */
    public T var;
    public Generic(T var){
        this.var=var;
    }
    public void display(){
        System.out.println("The value of var is : "+var);
    }
    public static void main(String[] args){
        Generic<Integer> ob=new Generic<Integer>(100);
        Generic<String> ob2=new Generic<String>("Tharanetharan ");
        ob.display();
        ob2.display();
    }
}
