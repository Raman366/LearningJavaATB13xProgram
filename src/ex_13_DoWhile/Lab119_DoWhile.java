package ex_13_DoWhile;

public class Lab119_DoWhile {
    public static void main(String[] args) {
        int a = 1;
        do {
            System.out.println("This is a Body, Which will execute atleast 1 time");
            System.out.println(a);
            a++;
        }while (a < 10);
    }
}
