abstract class Number{
    Integer value;
    Number(Integer value){
        this.value = value;
    }
    public abstract void show();
}
class Integers extends Number {
    Integers(Integer value) {
        super(value);
    }
    public void show(){
        System.out.println(value + " is an integer");
    }
}
public class AbstractThis {
    public static void main(String[] args) {
        Number obj = new Integers(7);
        obj.show();
    }
}