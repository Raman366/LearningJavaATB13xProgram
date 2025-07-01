package ex_14_Functions;

public class Lab124_Simple_Method {
    static void raman_r1(){
        System.out.println("No Return");
    }

    static int return_int(){
        System.out.println("This is a normal function which returns something.");
        System.out.println("This is a normal function which return something.");
        System.out.println("This is a normal function which return something.");
        return 10;
    }

    static boolean return_boolean(){
        return true;
    }
    static float return_float_pi_value(){
        return 3.14f;
    }

    static long return_long(){
        return 10l;
    }

    static String return_String(){
        return "Raman";
    }
}
