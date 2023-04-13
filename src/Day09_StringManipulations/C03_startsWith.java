package Day09_StringManipulations;

public class C03_startsWith {
    public static void main(String[] args) {

        String str="Java mutluluktur";

        System.out.println(str.startsWith("Java")); //true
        System.out.println(str.startsWith("j")); //false case sensitive
        System.out.println(str.startsWith("Java mutluluktur")); //true

        System.out.println(str.startsWith("")); //true

        System.out.println(str.contains("mutlu")); //true
        System.out.println(str.startsWith("mutlu")); //false

        System.out.println(str.startsWith("mutlu", 5)); // true
        // 5. index sonrasi mutlu ile baslar ?

        System.out.println(str.startsWith("v",2)); //true
    }
}
