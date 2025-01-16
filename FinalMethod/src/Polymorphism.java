class A{
    public void show(){
        System.out.println("i am good");
    }
}
class B extends A{
    public void show(){
        System.out.println("i am bad");
    }
    public void write(){
        System.out.println("no i am good");
    }
}
public class Polymorphism {
    public static void main(String[] args){
        A obj = new B();
        obj.show();
    }
}
