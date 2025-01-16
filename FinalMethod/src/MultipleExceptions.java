public class MultipleExceptions {
    public static void main(String[] args){
        try{
            int i = 8/9;
            int a[] = {1,2,3,4,5};
            a[6]= 5;
        }
        catch(ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println("error");
        }
        finally {
            System.out.println("bye");
        }
    }
}
