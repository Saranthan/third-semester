public class GenericNumeric<T extends Number> {
        T var;
        /*

         The sole purpose of Generic classes are generic property and type saftey.

         Type saftey:
                The jvm checks the type of Generic data at complile time enabling type saftey and data security.
        */
        public GenericNumeric(T var){
              this.var=var;
        }
        public void display(){
                System.out.println("The value of var is "+var);
        }
        public void getTypeName(){
                System.out.println("The value of var is "+var.getClass());
        }
        public static void main(String...a){
                GenericNumeric<Integer> ob=new GenericNumeric<Integer>(10000);
                ob.display();
                ob.getTypeName();
                //GenericNumeric<String> ob2=new GenericNumeric<String>("Tharane");
                //ob2.display();
        }
}
