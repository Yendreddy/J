
public class ExceptionHandling {
    public static void main(String[] args){
        try
        {
            int i =9/0;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Denominator should be greater than zero");
        };
        System.out.println("bye");
    }
}
