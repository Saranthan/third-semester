public class GenericMethod{

    public GenericMethod(){
        System.out.println("Just a constructor");
    }

    public <T> void peekArray(T[] arr) {
        for (T i : arr) {
            System.out.println(i + " ");
        }
    }

    public static void main(String...a){
        Integer[] arr={1,2,3,4,5,6,7,8,9,0};
        GenericMethod ob=new GenericMethod();
        ob.peekArray((arr));
        String[] star={"Tharane","Abisheik"};
        ob.peekArray(star);
    }
}
