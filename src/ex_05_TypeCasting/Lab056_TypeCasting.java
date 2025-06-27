package ex_05_TypeCasting;

public class Lab056_TypeCasting {
    public static void main(String[] args) {
        long phone = 8789887789l;
//        short s = phone; // Implicit not allowed
        short s1 = (short)phone; // We have to do Explicit Narrowing
    }
}
