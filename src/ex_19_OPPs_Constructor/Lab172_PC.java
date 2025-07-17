package ex_19_OPPs_Constructor;

public class Lab172_PC {
    public static void main(String[] args) {

        BabyA b1 = new BabyA();
        BabyA b2 = new BabyA();

        System.out.println(b2.name);
        System.out.println(b1.name);

        BabyA b3 = new BabyA("Raman", "223344", 2004,07,16);
        BabyA b4 = new BabyA("Rakesh", "223376", 2008,10,19);
        System.out.println(b3.name);
        System.out.println(b4.name);
    }

}
class BabyA{
    String name;
    String aadhar;
    int year;
    int month;
    int date;

// Default Constructor
    BabyA(){
        name = "Sumu";
        aadhar = "1122";
        year = 2001;
        month = 03;
        date = 10;
    }
//  Parameterized Constructor
    BabyA(String name_para, String aadhar_para, int year_para, int month_para, int date_para){
        this.name = name_para;
        this.aadhar = aadhar_para;
        this.year = year_para;
        this.month = month_para;
        this.date = date_para;

    }

}
