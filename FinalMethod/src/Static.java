interface Name {
    static void show(){
        System.out.println("i am an interface");
    }
}
public interface Static{
    public static void main(String[] args){
        Name.show();
    }
}
