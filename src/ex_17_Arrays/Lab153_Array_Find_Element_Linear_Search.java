package ex_17_Arrays;

public class Lab153_Array_Find_Element_Linear_Search {
    public static void main(String[] args) {
        int[] a = {24, 26, 76, 34, 88, 95, 45};
        // Target 88, Give index?
        int target = 88;
        for (int i = 0; i < a.length; i++) {
            if (target == a[i]){
                System.out.println(i);
            }
            
        }
    }
}
