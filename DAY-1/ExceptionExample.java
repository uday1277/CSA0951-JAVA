import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
public class ExceptionExample {
    public static void main(String[] args) {
        try {
            int a = 10, b = 0;
            int result = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
        try {
            int a[] = {1,2,3,4,5};
            int b = a[6];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
        try {
            Class.forName("NonExistentClass");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + e.getMessage());
        }
        try {
            File file = new File("NonExistentFile.txt");
            FileReader fileReader = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}