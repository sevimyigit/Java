package Day09_StringManipulations;

public class C02_Contains {
    public static void main(String[] args) {

        String str="Java Ogren , mutlu ol";

        //str mutlu iceriyor mu ?

        System.out.println(str.contains("mutlu"));

        //charSequence : char dizisi


        System.out.println(str.contains("j")); // false

        System.out.println(str.contains("J")); //true (case sensetive)

        System.out.println(str.contains(" ")); // true

        // contains methodu kac tane olduguna degil olup olamdigina bakar

        System.out.println(str.contains("Java") && str.contains("mutlu")); //true
    }
}
