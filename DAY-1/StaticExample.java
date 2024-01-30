public class StaticExample
{
    static int staticVariable = 10;
    static void staticMethod()
    {
        System.out.println("This is a static method.");
    }
    public static void main(String[] args)
    {
        System.out.println("Static Variable: " + StaticExample.staticVariable);
        StaticExample.staticMethod();
    }
}
