import java.util.Scanner;

abstract class Human {
    int num;
    public abstract void man();
    public abstract void woman();
}
class Gender extends Human {
    public void man(){
        if(num%2 == 0)
            System.out.println("I am man");
    }
    public void woman(){
        if(num%2 != 0)
            System.out.println("I am woman");
    }
}
public class Abstract {
    public static void main(String[] args){
        Human obj = new Gender();
        Human obj1 = new Gender();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");

        String input = sc.nextLine();
        int inputNum = Integer.parseInt(input);
        obj.num = inputNum;
        obj1.num = inputNum;
        obj.man();
        obj1.woman();
    }

}