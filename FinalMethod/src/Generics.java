import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Generics {
    public static void main(String[] args){
        List<Integer> values = new ArrayList<>();
        values.add(0,554);
        values.add(1,398);
        values.add(2,865);
        values.add(3, 129);
        Comparator<Integer> c = new Comparator<>(){
            public int compare(Integer i, Integer j){
                if(i%10 > j%10)
                    return 1;
                else
                    return -1;
            }
        };
        Collections.sort(values, c);
        System.out.println(values);
    }
}
