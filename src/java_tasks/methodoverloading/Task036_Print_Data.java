package java_tasks.methodoverloading;

public class Task036_Print_Data {
    public static void main(String[] args) {

        Printer p1 = new Printer();
        p1.printData("Raman");
        p1.printData(25);
        p1.printData(45.76f);
    }
}

class Printer{

    void printData(String data){
        System.out.println("String: " + data);
    }

    void printData(int data){
        System.out.println("Int: " + data);
    }

    void printData(float data){
        System.out.println("Float: " + data);
    }
}
