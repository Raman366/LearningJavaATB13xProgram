package java_tasks;

public class Task031_Parameterized_Constructor {
    public static void main(String[] args) {

        NewStudent s1 = new NewStudent("Chaman", 26);
        System.out.println(s1.name);
        System.out.println(s1.age);
    }
}

class NewStudent{
    String name;
    int age;

    // Parameterized Constructor
    NewStudent(String new_name, int new_age){
        this.name = new_name;
        this.age = new_age;
    }
}
