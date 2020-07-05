package ml.Boettger.Chapter_04_Question_04;

public class Feline {
    public static void main(String[] args) {
        long x = 42L;
        long y = 44L;
        System.out.print(" " + 7 + 2 + " ");
        System.out.print(foo() + x + 5 + " ");
        System.out.println(x + y + foo());
    }
    static String foo() { return "foo"; }
}        
