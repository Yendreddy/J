import java.util.Scanner;

abstract class HumanBeing {
    int num;
    public abstract void man();
    public abstract void woman();
}
class Gender extends HumanBeing {
    public void man(){
        if(num%2 == 0)
            System.out.println("I am man");
    }
    public void woman(){
        if(num%2 != 0)
            System.out.println("I am woman");
    }
}
public class AbstractScanner {
    public static void main(String[] args){
        HumanBeing obj = new Gender();
        HumanBeing obj1 = new Gender();
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
