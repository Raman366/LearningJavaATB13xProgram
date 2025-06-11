package ex_04_Operators;

public class Lab044_Interview {
    public static void main(String[] args) {
        int raman_salary = 12;
        boolean b = !(raman_salary > 10 || raman_salary < 5);
        System.out.println(b);

        // A - balaji_salary > 10 -> 12 > 10 -> true
        // B -> balaji_salary < 5  12 < 5 -> false
        // !(A || B) -> !(true || false) -> !true - false
    }
}
