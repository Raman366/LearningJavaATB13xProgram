package ex_11_For_Loop;

public class Lab107_For_Loop_Continue {
    public static void main(String[] args) {
        for (int i=0; i<50; i++){
            if (i == 5){
                continue; // Skips the code and move to the next top
            }
            System.out.println(i);
        }
    }
}
