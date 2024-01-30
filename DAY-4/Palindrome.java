import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the string");
        String s1=s.next();
        String s2 = "";
        int len = s1.length();
        for (int i = len - 1; i >= 0; i--) {
            s2 = s2 + s1.charAt(i);
        }
        if (s1.equals(s2))
            System.out.print("palindrome");
        else
            System.out.print("not palindrome");
    }
}