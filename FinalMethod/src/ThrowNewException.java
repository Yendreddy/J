class DurgaException extends Exception{
    public DurgaException(String s){
        super(s);
    }
}
public class ThrowNewException {
    public static void main(String[] args){
        try{
            int i = 8;
            int j = 9;
            int k = i/j;
            if(k == 0)
                throw new Exception("hey you are getting error");
            System.out.println(k);
        }
        catch (Exception e){
            System.out.println("Error " + e.getMessage());
        }
        finally {
            System.out.println("bye");
        }
    }
}
