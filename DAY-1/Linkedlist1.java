import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist1 {
        public static void main(String args[]){
            LinkedList<String> al=new LinkedList<>();
            al.add("Ravi");
            al.add("Vijay");
            al.add("Ravi");
            al.add("Ajay");
            al.remove("Ajay");
            for (int i = 0; i < al.size(); i++) {
                System.out.println(al.get(i));
            }
        }
    }

