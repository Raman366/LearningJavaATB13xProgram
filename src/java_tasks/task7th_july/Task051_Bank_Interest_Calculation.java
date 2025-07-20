package java_tasks.task7th_july;

public class Task051_Bank_Interest_Calculation {
    public static void main(String[] args) {

        Bank sbi = new SBI();
        Bank hdfc = new HDFC();

        sbi.getInterestRate();
        hdfc.getInterestRate();
    }
}

abstract class Bank{
    abstract void getInterestRate();
}

class SBI extends Bank{

    @Override
    void getInterestRate() {
        System.out.println("SBI Interest Rate: 6.5%");
    }
}
class HDFC extends Bank{

    @Override
    void getInterestRate() {
        System.out.println("HDFC Interest Rate: 7.0%");
    }
}