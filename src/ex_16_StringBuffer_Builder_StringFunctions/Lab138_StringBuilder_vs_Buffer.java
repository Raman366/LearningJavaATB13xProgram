package ex_16_StringBuffer_Builder_StringFunctions;

public class Lab138_StringBuilder_vs_Buffer {
    public static void main(String[] args) {

        String s0 = "Raman";
        String s1 = new String("Raman");

        StringBuilder stringBuilder = new StringBuilder("Raman");
        StringBuffer stringBuffer = new StringBuffer("Raman");

        System.out.println(s0);
        System.out.println(s1);
        System.out.println(stringBuilder);
        System.out.println(stringBuffer);

    }
}
