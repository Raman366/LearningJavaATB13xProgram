package java_tasks;

public class Task003_ID_Program2 {
    public static void main(String[] args) {
        int i = 1;
        i = i++ + ++i;
        // i++ -> A -> ExpA -> 1 , i ->  2
        // +
        // ++i -> B -> ExpB -> 3 , i -> 3
        System.out.println(i); // 4
    }
}
