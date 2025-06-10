package ex_03_Literals;

public class Lab030_Char_Literals {
    public static void main(String[] args) {
        char c1 = 'A'; // A to Z, a-z, !@#$%^&*()_+
        char c2 = 'B';
        char c3 = '@';
        char c4 = '_';
        char c5 = '9';
        char c6 = '1';
        char c7 = '(';

        // Escape Char
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

        System.out.println("RamanKumar");
        System.out.println("Raman"+new_line+"Kumar");
        System.out.println("Raman"+tab_line+"Kumar");
        System.out.println("Raman"+back_space+"Kumar");
        System.out.println("Raman"+carriage_return+"Kumar");

        System.out.println("Hey!, this is first line"+new_line+"this the second line\n and this is third line");

        char c10 = 'A';
        //  // ASCII, (limited numbers) - A -> 65



        char c11  = '\u1F60';
        char my_laugh_smily = '\u1f60'; // :)
        System.out.println(my_laugh_smily);
    }
}
