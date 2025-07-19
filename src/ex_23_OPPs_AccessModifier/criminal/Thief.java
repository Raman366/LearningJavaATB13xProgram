package ex_23_OPPs_AccessModifier.criminal;

import ex_23_OPPs_AccessModifier.police.Cop;

public class Thief {
    public static void main(String[] args) {

        Cop thief = new Cop(100);
        thief.gun = 100;
    //    thief.canIShoot();
    //    thief.thisDefaultF1();
    }
}
