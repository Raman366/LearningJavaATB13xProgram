package ex_21_OOPs_Polymorphism.methodoverriding;

public class Lab185_MethodOverriding_Automation {
    public static void main(String[] args) {

        ChromeTC c1 = new ChromeTC();
        c1.openBrowser();

        FireFox f1 = new FireFox();
        f1.openBrowser();

        CommonToAll common = new CommonToAll();
        common.openBrowser();

        CommonToAll c2 = new ChromeTC();
        c2.openBrowser();

        CommonToAll c3 = new FireFox();
        c3.openBrowser();

        // Firefox ff = new ChromeTC(); Not relation

    }
}

class CommonToAll{
    void openBrowser(){
        System.out.println("Starting IE Browser");
    }
}

class ChromeTC extends CommonToAll{
    @Override
    void openBrowser(){
        System.out.println("Starting Chrome Browser");
    }
}

class FireFox extends CommonToAll{
    @Override
    void openBrowser() {
        System.out.println("Starting FireFox browser");
    }
}
