abstract class Data{
    public int id = 1;
    String name = "Kamal";
    final String CEO = "Sunny";
    public abstract void show();
}
class Tom extends Data{
    Tom(){
        id = 2;
    }

    public void show(){
        System.out.println(id + "is employee id");
        System.out.println(name + "is employee name");
        System.out.println(CEO + "is employee's CEO");
    }
}
public class AbstractFinal {
    public static void main(String[] args) {
        Data obj = new Tom();
        obj.show();
    }
}