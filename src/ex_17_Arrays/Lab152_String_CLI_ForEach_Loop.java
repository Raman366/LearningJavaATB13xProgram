package ex_17_Arrays;

public class Lab152_String_CLI_ForEach_Loop {
    public static void main(String[] raman) {

        for (int i = 0; i < raman.length; i++) {
            System.out.println(raman[i]);
            
        }
        System.out.println("------");

        for (String arg:raman){
            System.out.println(arg);
        }

    }
}
