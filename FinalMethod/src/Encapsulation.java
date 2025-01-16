class Student{
    private int rollno;
    private String name;
    public void setRollno(int r){
        rollno = r;
    }
    public int getRollno(){
        return rollno;
    }
    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
}
public class Encapsulation {
    public static void main(String[] args){
        Student obj = new Student();
        obj.setRollno(5);
        obj.setName("Henry");
        System.out.println(obj.getRollno());
        System.out.println(obj.getName());
    }
}
