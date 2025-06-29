package ex_10_Switch;

public class Lab089_JDK13 {
    public static void main(String[] args) {
        int itemcode = 006;

        switch (itemcode){
            case 001,002,003:
                System.out.println("All of them are Electronics Gadgets");
                break;
            case 004,005,006:
                System.out.println("These are Mechanical Gadgets");
                break;
            default:
                System.out.println("None");
        }
    }
}
