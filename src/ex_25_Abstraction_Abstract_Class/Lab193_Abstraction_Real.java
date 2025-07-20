package ex_25_Abstraction_Abstract_Class;

public class Lab193_Abstraction_Real {
    public static void main(String[] args) {
        // Employee e1 = new Employee();
        Company c1 = new Company();
        c1.computePay();
    }

    }

    abstract class Employee {
        private String name;
        private String address;
        private int number;

        Employee() {
            System.out.println("Default Cons");
        }

        Employee(String u_name, String u_address, int u_number) {
            System.out.println("Constructing an Employee");
            this.name = u_name;
            this.address = u_address;
            this.number = u_number;
        }

        abstract double computePay();

        void mailCheck() {
            System.out.println("Sending a mail check to: " + this.name + " " + this.address);
        }
    }
class Company extends Employee {

    @Override
    double computePay() {
        return 10000;
    }
}
