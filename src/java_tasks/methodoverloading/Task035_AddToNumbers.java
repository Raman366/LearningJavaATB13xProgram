package java_tasks.methodoverloading;

public class Task035_AddToNumbers {
    public static void main(String[] args) {

        Calculator cal = new Calculator();
        int sum_int = cal.add(20, 30);
        System.out.println("Sum = " + sum_int);

        double sum_double = cal.add(4.35, 9.32);
        System.out.println("Sum = " + sum_double);
    }
}

class Calculator{

    int add(int a, int b){
        return a + b;
    }

    double add(double a, double b){
        return a + b;
    }
}
