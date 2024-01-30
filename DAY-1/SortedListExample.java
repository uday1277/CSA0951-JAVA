import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class SortedListExample
{
    public static void main(String[] args)
    {
        List<Integer> n = new ArrayList<>();
        n.add(5);
        n.add(2);
        n.add(8);
        n.add(1);
        n.add(3);
        System.out.println("Original list: " + n);
        Collections.sort(n);
        System.out.println("Sorted list: " + n);
    }
}
