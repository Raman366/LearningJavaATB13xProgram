package ex_14_Functions;

public class Lab125_User_Defined_One {
    public static void main(String[] args) {
        int result = sum_of_numbers(3, 4);

        sum_of_numbers_no_return(4, 5);
        System.out.println(result);

    }
    static int sum_of_numbers(int a, int b){
        return a + b;
    }
    static void sum_of_numbers_no_return(int a, int b){
        System.out.println(a+b);
    }
}
