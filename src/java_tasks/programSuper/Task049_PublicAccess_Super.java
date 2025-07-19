package java_tasks.programSuper;

public class Task049_PublicAccess_Super {
    public static void main(String[] args) {
        NewStudent student = new NewStudent();
        student.showInfo();
    }
}

class NewStudent{
    public void showInfo(){
        System.out.println("Public Access : Student");
    }
}
