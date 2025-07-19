package java_tasks.methodoverriding;

public class Task042_Employee_Role {
    public static void main(String[] args) {

        Manager m1 = new Manager();
        m1.role();

        Clerk c1 = new Clerk();
        c1.role();

        Tester t1 = new Tester();
        t1.role();
    }
}

class Employee{
    void role(){
        System.out.println("General Employee");
    }
}
class Manager extends Employee{

    @Override
    void role(){
        System.out.println("This employee is: Manager");
    }
}
class Clerk extends Employee{

    @Override
    void role(){
        System.out.println("This employee is: Clerk");
    }
}
class Tester extends Employee{

    @Override
    void role(){
        System.out.println("This employee is: Tester");
    }
}
