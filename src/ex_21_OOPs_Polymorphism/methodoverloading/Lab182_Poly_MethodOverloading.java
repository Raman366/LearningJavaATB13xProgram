package ex_21_OOPs_Polymorphism.methodoverloading;

public class Lab182_Poly_MethodOverloading {
    public static void main(String[] args) {

        MathOperations m1 = new MathOperations();
        int r1 = m1.add(8, 9);
        int r2 = m1.add(5, 6, 9);
        double r3 = m1.add(3.32, 4.32);
        String r4 = m1.add("Raman", "Kumar");

    }
}

class MathOperations{

    // In the same class, When you have a method wit same
    // Same name methods but different arguments and different return type.

    int add(int a, int b){
        return a + b;
    }

    int add(int a, int b, int c){
        return a + b + c;
    }

    double add(double a, double b){
        return a + b;
    }

    String add(String a, String b){
        return a + b;
    }
}
