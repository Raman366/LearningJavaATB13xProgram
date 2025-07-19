package java_tasks.methodoverriding;

public class Task043_Login_Function {
    public static void main(String[] args) {

        User us = new User();
        us.login();
    }
}

class User{
    void login(){
        System.out.println("User Login");
    }
}
class AdminUser extends User{

    @Override
    void login(){
        System.out.println("Admin login");
    }
}
class RegularUser extends User{

    @Override
    void login(){
        System.out.println("Regular user login");
    }
}
