package ex_23_OPPs_AccessModifier;

public class Lab188 {
}

class Father{
    private int gold = 10;
    int car = 2;
    public int bhk3 = 2;
}

class Son extends Father{
    void weCanUse(){
        //   System.out.println(gold);
        System.out.println(car);
        System.out.println(bhk3);
    }
}
