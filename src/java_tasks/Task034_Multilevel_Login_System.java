package java_tasks;

public class Task034_Multilevel_Login_System {
    public static void main(String[] args) {

        SuperAdmin su = new SuperAdmin();

        su.login();
        su.accessAdminPanel();
        su.shutdownSystem();
    }
}

class User{
    void login(){
        System.out.println("User is logged in");
    }
}

class AdminUser extends User{
    void accessAdminPanel(){
        System.out.println("This is Admin Panel");
    }
}

class SuperAdmin extends AdminUser{
    void shutdownSystem(){
        System.out.println("System shutdown initiated");
    }
}