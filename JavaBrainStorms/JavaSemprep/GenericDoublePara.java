public class GenericDoublePara<T,A>{
        T var1;
        A var2;

        public GenericDoublePara(T var1,A var2) {
            this.var1=var1;
            this.var2=var2;
        }

        public void print(){
            System.out.println("var1 value is "+var1);
            System.out.println("var2 value is "+var2);
        }
        public static <T,Z,C>  void printDynamic(T val1,Z val2){
        System.out.println("Dynamially printed");
        System.out.println("var1 value is "+val1);
        System.out.println("var2 value is "+val2);
    }

        public static <T,Z,C>  void printDynamic(T val1,Z val2,C val3){
            System.out.println("Dynamially printed");
            System.out.println("var1 value is "+val1);
            System.out.println("var2 value is "+val2);
            System.out.println("Var3 value is "+val3);
        }
        public static void main(String[] args){
            GenericDoublePara<Integer,Integer> ob=new GenericDoublePara<Integer,Integer>(100,200);
            GenericDoublePara.printDynamic("Tharane","Sabari","Abisheik");
            GenericDoublePara.printDynamic("Sugu","Deepan");
            ob.print();
        }
}
