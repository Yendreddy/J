class Live implements Food{
    public void show(){
        System.out.println("You need to eat food to live");
    }
}
interface Food{
    public void show();
    default public void eat(){
        System.out.println("I am eatable");
    }
}
class Fruits extends Live implements Food{

}
public class Interface {
    public static void main(String[] args){
        Food obj = new Fruits(){
            public void show(){
                System.out.println("EAT HEALTHY FOOD");
                super.show();
            }
        };
        obj.eat();
        obj.show();
    }
}
