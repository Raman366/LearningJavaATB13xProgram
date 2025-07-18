package ex_20_Inheritance.multilevel_inheritance;

public class Lab177_Multi_Level {
    public static void main(String[] args) {

        GrandFather gf = new GrandFather();
        gf.gf();

        System.out.println("-------");

        Father f = new Father();
        f.f();
        f.gf();

        System.out.println("-------");

        Son s = new Son();
        s.gf();
        s.f();
        s.s();
    }
}
