package ex_19_OPPs_Constructor;

public class Lab173_PC_Real {
    public static void main(String[] args) {

        Person p1 = new Person("Raman", 989898788, "Delhi");
        Person p2 = new Person("Chandu", 989856548, "Patna");

        System.out.println(p1.name);
        System.out.println(p2.name);

//        Person p3  = new Person();
//        p3.name  = "Smita";
//        System.out.println(p3.name);
    }
}

class Person{
    String name;
    long phone;
    String address;

    Person(String name_user){
        this.name = name_user;
    }

    Person(String name_user, long phone_user, String address_user){
        this.name = name_user;
        this.phone = phone_user;
        this.address = address_user;

    }
    Person(String name_user, long phone_user) {
        this.name = name_user;
        this.phone = phone_user;
    }
}
