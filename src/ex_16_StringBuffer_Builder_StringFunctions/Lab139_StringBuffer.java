package ex_16_StringBuffer_Builder_StringFunctions;

public class Lab139_StringBuffer {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Raman");
        stringBuffer.append("Kumar");
        System.out.println(stringBuffer);

        System.out.println(stringBuffer.reverse());

        String s1 = "Hello";
        String s2 = "World";
        String s3 = s1 + s2; // Creates a new string 'Hello World'
        System.out.println(s3); // Output: HelloWorld
        System.out.println(s1);
    }
}
