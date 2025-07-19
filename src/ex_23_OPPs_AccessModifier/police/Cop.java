package ex_23_OPPs_AccessModifier.police;

public class Cop {

    public int gun;
    String iCard;

    public Cop(int bullet){
        this.gun = bullet;

    }
    protected void canIShoot(){
        System.out.println("Yes you can!!");
    }
    void thisDefaultF1(){
        System.out.println("Hi Cop");
    }
}
