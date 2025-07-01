package ex_15_Strings;

public class Lab136_String_Functions {
    public static void main(String[] args) {
        String str1 = "Raman";
        String str2 = "Raman";

        String str3 = new String("Raman");
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str1.equals(str3));
    }
}
