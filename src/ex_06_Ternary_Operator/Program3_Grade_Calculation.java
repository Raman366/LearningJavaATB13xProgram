package ex_06_Ternary_Operator;

public class Program3_Grade_Calculation {
    public static void main(String[] args) {
        /*
        Rough logic

        marks = 90+ -> A+
        marks = 75 to 89 -> A
        marks = 60 to 74 -> B
        marks = 40 to 59 -> C
        marks < 40 -> Fail
        */
        int marks = 69;
        String grade = (marks >= 90) ? "A+" : (marks >=75) ? "A" : (marks >=60) ? "B" : (marks >=40) ? "C" :"Fail";
        System.out.println(grade);

    }
}
