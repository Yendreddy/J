public class ThrowsException {
    static void checkAge(int Age)throws ArithmeticException{
        if (Age < 18){
            throw new ArithmeticException(" You are not adult");
        }
        else{
            System.out.println("You are adult");
        }
    }
    public static void main(String[] args)throws ArithmeticException{
        checkAge(15);
    }
}
