package ex_05_TypeCasting;

public class Lab054_TypeCasting {
    public static void main(String[] args) {
        byte b = 30;
        int a = b; // Widening-> Implicit Casting
        int a1 = (int)b; // Widening-> Explicit Casting

        // In case of widening, we don't need to do Explicit casting(it's ok if you have done)
    }
}
