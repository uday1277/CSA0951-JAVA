import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {
    public static void main(String args[]){
        ArrayList<String> list=new ArrayList<String>();
        list.add("Ravi");
        list.add("Vijay");
        list.remove("Ravi");
        list.add("Ajay");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}

