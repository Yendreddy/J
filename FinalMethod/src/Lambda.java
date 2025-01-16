interface Games{
    public void show();
}

public class Lambda {
    public static void main(String[] args){
        Games obj = () -> System.out.println("I like Cricket");
        obj.show();
    }
}
