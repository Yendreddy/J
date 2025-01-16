class Hello extends Thread{
    public void run(){
        for(int i=1; i<=5; i++){
            System.out.println("Hello");
        }
    }
}
class Hi extends Thread{
    public void run(){
        for(int j=1; j<=5; j++){
            System.out.println("Hi");
        }
    }
}
public class Threads {
    public static void main(String[] args)throws Exception{
        Hello obj = new Hello();
        Hi obj1 = new Hi();
        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj1);
        t1.setPriority(1);
        t2.setPriority(10);
        t1.start();
        try{
            Thread.sleep(500);
        }
        catch(Exception e){
        }
        t2.start();
        try{
            Thread.sleep(500);
        }
        catch(Exception e){
        }
        t1.join();
        t2.join();
        System.out.println("bye");
    }

}
