package java_tasks.programSuper;

public class Task047_Default_Super {
    public static void main(String[] args) {
        Student st = new Student();
        st.showDetails();
    }
}

class Student{
    void showDetails(){
        System.out.println("Here is the details of the student");
    }
}
