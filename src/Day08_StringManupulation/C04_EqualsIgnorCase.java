package Day08_StringManupulation;

public class C04_EqualsIgnorCase {
    public static void main(String[] args) {

        String str1="Pazar";
        String str2="PAZAR";
        String str3="pazar";
        String str4="PaZar";

        System.out.println(str1==str2); // false
        System.out.println(str1==str3); //false
        System.out.println(str1==str4); //false

        System.out.println(str1.equals(str2)); //false
        System.out.println(str1.equals(str3)); //false
        System.out.println(str1.equals(str4)); //false
        /*
        Eger iki metni karsilastirirken buyuk harf ve kucuk harf duyarliligi (case sensetive) onemsiz ise;
        o zaman
        equalsIgnoreCase=() kullanilir
         */

        System.out.println(str1.equalsIgnoreCase(str2)); //true
        System.out.println(str1.equalsIgnoreCase(str3)); //true
        System.out.println(str1.equalsIgnoreCase(str4)); //true

    }
}
