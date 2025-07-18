package ex_20_Inheritance.multilevel_inheritance;

public class Lab179_Multi_Leve {
    public static void main(String[] args) {

    //    Son s1 = new Father();
//  Son s1 = new GrandFather();
    Son raman = new Son();
        System.out.println(raman.gold_gf);
        raman.gf();

        GrandFather grandFather = new Son();
        grandFather.home();

    }
}
