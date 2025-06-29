package ex_10_Switch;

public class Lab084_Interview {
    public static void main(String[] args) {
        char ch = 'A';
        switch (ch){

            case 65:
                System.out.println("Match ASCII");
                break;
            default:
                System.out.println("No match");
                break;
        }
    }
}
