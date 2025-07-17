package ex_19_OPPs_Constructor;

public class Lab169_Opps_Constructor {
    public static void main(String[] args) {

        Baby b1 = new Baby();
    }

}

class Baby{
    // Attribute | Instance Variable |  Member variables, data members
    String name;

//  Default Constructor
    Baby(){
        System.out.println("Hey! I am default constructor");
        System.out.println("Your Aadhar is ready!");

        // Fetch data from the MySQL database...
        // Read from CSV File , XLSX
        // Open a file and read the data. (json, testdata.xlsx, txt file)

    }
    void m1() {
        System.out.println("I m1");
    }
    void cry(){
        System.out.println("Cry");
    }

    void sleep(){
        System.out.println("Sleep");
    }

    void eat(){
        System.out.println("Eat");
    }
}
