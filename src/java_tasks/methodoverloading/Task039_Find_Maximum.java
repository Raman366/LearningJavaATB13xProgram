package java_tasks.methodoverloading;

public class Task039_Find_Maximum {
    public static void main(String[] args) {

        Utility u1 = new Utility();
        int max_int2 = u1.max(10, 30);
        System.out.println("Largest of two number is " + max_int2);

        int max_int3 = u1.max(3, 5, 9);
        System.out.println("Largest of three number is " + max_int3);

        double max_d = u1.max(11.32, 15.67);
        System.out.println("Largest of two double is " + max_d);
    }
}

class Utility{

    int max(int a, int b){
        return Math.max(a, b);
    }

    int max(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        }else if(b > a && b > c){
            return b;
        }else {
            return c;
        }
    }

    double max(double a, double b){
        return Math.max(a, b);
    }
}