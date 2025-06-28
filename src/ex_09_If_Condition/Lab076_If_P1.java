package ex_09_If_Condition;

public class Lab076_If_P1 {
    public static void main(String[] args) {
        int age = Integer.parseInt(args[0]);
        if (age > 18){
            System.out.println("You are allowed to go Thailand");
        }else {
            System.out.println("You are not allowed to go to Thailand");
        }
    }
}
