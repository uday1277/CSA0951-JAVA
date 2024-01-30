import java.util.Vector;

public class VectorExample
{
    public static void main(String[] args)
    {
        Vector<Integer> v = new Vector<>();
        v.add(5);
        v.add(7);
        v.add(10);
        v.add(15);
        System.out.println("Vector elements:");
        for (int i = 0; i < v.size(); i++)
        {
            System.out.println(v.get(i));
        }
        v.remove(0);
        v.remove(2);
        System.out.println("Vector elements after removing:");
        for (int i = 0; i < v.size(); i++)
        {
            System.out.println(v.get(i));
        }
    }
}
