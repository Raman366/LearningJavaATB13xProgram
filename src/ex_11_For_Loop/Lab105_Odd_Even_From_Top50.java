package ex_11_For_Loop;

public class Lab105_Odd_Even_From_Top50 {
    public static void main(String[] args) {
        // Find the even number form 1 to 50
        for (int i=1;i<=50; i++){ // 1 to 50 -> times 50
            // i%2 == 0
            if (i%2==0){
                System.out.println("It's a even number ->" + i);
            }
        }
    }
}
