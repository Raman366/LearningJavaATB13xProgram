package ex_15_Strings;

public class Lab137_String_Functions {
    public static void main(String[] args) {

        String name = "Raman"; // 0,1,2,3,4
        System.out.println(name.length());
        System.out.println(name.charAt(3));
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(2));
        System.out.println(name.charAt(1));
        System.out.println(name.charAt(4));
     //   System.out.println(name.charAt(7)); // java.lang.StringIndexOutOfBoundsException

        System.out.println(name.concat(" Kumar"));

        // 3. contains()
        System.out.println(name.contains("as"));

        // 4. equals()
        System.out.println(name.equals("Raman"));

        // 5. equalsIgnoreCase()
        System.out.println(name.equalsIgnoreCase("Raman"));

        // 6. indexOf() // Raman -> ? m
        System.out.println(name.indexOf("m"));

        String s1 = "Sono";
        // Returns the index within this string of the
        // first occurrence of the specified substring.
        System.out.println(s1.indexOf("o"));
        System.out.println(s1.lastIndexOf("o"));

        // 7. length()
        System.out.println(name.length());

        // 8. replace(,) // Raman
        System.out.println(name.replace('n', 'N'));

        // 9. split()
        String name1 = "raman@kumar.com@321";
        String[] split_name1 = name1.split("@");
        System.out.println(split_name1[0]);
        System.out.println(split_name1[1]);
        System.out.println(split_name1[2]);

        // 10. substring() // Raman
        System.out.println(name.substring(1, 3));

        // 11. toLowerCase()
        System.out.println("RAMAN".toLowerCase());

        // 12. toUperCase()
        System.out.println("raman".toUpperCase());

        // 13. startsWith()
        System.out.println(name.startsWith("R"));

        // 14. endsWith()
        System.out.println(name.endsWith("k"));

        String anotherPalindrome = "Niagara. O roar again!";
        System.out.println(anotherPalindrome.length());

        String extract = anotherPalindrome.substring(11,15);
        System.out.println(extract);

        //        Concatenation (By +)

        String s11 = "Hello";
        String s22 = "World";

        String s33 = "kya";
        String result1 = s11 + s33 + s22;
        System.out.println(result1);

        String n = "RAmankUMAR";
        System.out.println(n.indexOf("A"));
        System.out.println(n.lastIndexOf("A"));
        System.out.println(n.lastIndexOf("s"));

    }
}
