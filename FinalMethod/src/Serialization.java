import java.io.*;
import java.util.HashMap;
import java.util.Map;

class Person implements Serializable {
    public int i;
    public String s;
    Person(String s, int i){
        this.i = i;
        this.s = s;
    }
}
public class Serialization {
    public static void main(String[] args){
        Person object =  new Person("adam", 30);
        try{
            FileOutputStream file = new FileOutputStream ("person.ser");
            ObjectOutputStream out = new ObjectOutputStream(file);

            out.writeObject(object);
            out.close();
            file.close();
            System.out.println("this will store serialiazable file");
        }
        catch(IOException e){
            e.printStackTrace();
        }
        Person object1 = null;
        try{
            FileInputStream file = new FileInputStream("person.ser");
            ObjectInputStream in = new ObjectInputStream(file);
            object1 = (Person)in.readObject();
            in.close();
            file.close();
            System.out.println("Object is deserialized");
            System.out.println("name =" +object1.s);
            System.out.println("age =" +object1.i);
        }
        catch(FileNotFoundException e){
            throw new RuntimeException();
        }
        catch(IOException e){
            throw new RuntimeException();
        }
        catch(ClassNotFoundException e){
            throw new RuntimeException();
        }
    }
}

