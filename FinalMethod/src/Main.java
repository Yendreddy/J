class Human{
    final void show(){
        System.out.println("I am a living thing");
    }
    public void read(){
        System.out.println("I am also a human");
    }
}
class Man extends Human{
    public void write(){
        System.out.println("I am a mam");
        super.show();
        super.read();
    }
}
public class Main {
    public static void main(String[] args) {
        Man obj = new Man();
        obj.write();

    }

}