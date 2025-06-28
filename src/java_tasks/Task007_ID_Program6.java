package java_tasks;

public class Task007_ID_Program6 {
    public static void main(String[] args) {
        int x = 5;
        int y = x++ + ++x + x++ + ++x;
        System.out.println("x = " + x + ", y = " + y); // x=9 , y=28

        //  Summary Table:
        // Expression	Value Used	x after
        // x++	            5	      6
        // ++x	            7	      7
        // x++	            7	      8
        // ++x	            9      	  9
    }
}
