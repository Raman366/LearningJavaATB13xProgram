package java_tasks.methodoverloading;

public class Task037_Multiply_Numbers {
    public static void main(String[] args) {

        MathOperation m1 = new MathOperation();
        int result1 = m1.multiply(10, 20);
        System.out.println("Product of two numbers are: " + result1);
        int result2 = m1.multiply(5, 6, 10);
        System.out.println("Product of three numbers are: " + result2);
    }
}

class MathOperation{

    int multiply(int a, int b){
        return a * b;
    }

    int multiply(int a, int b, int c){
        return a * b * c;
    }
}
