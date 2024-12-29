
public class CustomException extends RuntimeException {

    public CustomException(String msg){
        super(msg);
    }
    //Custom exception in java is a user-defined excetpion.
    public static void validate(int age) throws CustomException {
        if(age<18) {
            throw new CustomException("Your age is too low ! ");
        }else{
            System.out.println("YOUR AGE IS GOOD TO VOTE ");
        }
    }
}

class Main{
    public static void main(String...a){
        try{
            int age=10;
            CustomException.validate(age);
        }catch(CustomException e){
            System.out.println("The Custom exception thrown is :"+e.getMessage());
        }
    }
}
