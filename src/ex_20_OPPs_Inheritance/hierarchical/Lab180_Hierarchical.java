package ex_20_OPPs_Inheritance.hierarchical;

public class Lab180_Hierarchical {
    public static void main(String[] args) {

        Father f1 = new Father();
        Suru s1 = new Suru();

        f1.home();
        s1.home();

        Raman r1 = new Raman();
        r1.home();

        Kavi k1 = new Kavi();
        k1.home();
        k1.h3();
    }

}

class Father{
    void home(){
        System.out.println("3BHK");
    }
}

class Raman extends Father{
    void h2(){
        System.out.println("H2 - Raman");
    }
}

class Kavi extends Father{
    void h3(){
        System.out.println("H3 - Kavi");
    }
}

class Suru extends Father{
    void s1(){
        System.out.println("S1 - Suru");
    }
}