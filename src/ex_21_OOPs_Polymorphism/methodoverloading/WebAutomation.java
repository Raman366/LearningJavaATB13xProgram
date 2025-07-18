package ex_21_OOPs_Polymorphism.methodoverloading;

public class WebAutomation {
    public static void main(String[] args) {

        Browser b1 = new Browser();
        b1.startBrowser("Chrome");
    }
}

class Browser{

    void startBrowser(){
        System.out.println("Starting the default browser");

    }

    String startBrowser(String browser){
        System.out.println("Starting browser: " + browser);
        return browser;
    }
}
