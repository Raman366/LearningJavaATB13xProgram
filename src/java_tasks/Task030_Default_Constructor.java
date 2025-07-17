package java_tasks;

public class Task030_Default_Constructor {
    public static void main(String[] args) {

        Student s1 = new Student();
        System.out.println(s1.name);
        System.out.println(s1.age);
    }
}

class Student{
    String name;
    int age;

    // Default Constructor
    Student(){
        name = "Raman";
        age = 28;
    }
}
