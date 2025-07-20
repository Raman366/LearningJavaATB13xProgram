package java_tasks.task7th_july;

public class Task054_Multiple_Inheritance_Interface {
    public static void main(String[] args) {
         Document doc = new Document();
         doc.print();
         doc.show();
    }
}

interface Printable{
    void print();

}
interface Showable{
    void show();
}

class Document implements Printable, Showable{

    @Override
    public void print() {
        System.out.println("Give the document for printing");
    }

    @Override
    public void show() {
        System.out.println("Show the document for verification");
    }
}