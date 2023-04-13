package Day12_MethodCreation;

public class C08_PaLindrome {
    public static void main(String[] args) {
        //verilen bir String in polindrome olup olmadigini yazdirin
        //PaLindrome = duz okunusu ile tersten okunusu birbirine ayni olan

        String str="ey edip adanada pide ye";

        String tersStr=C07_TerseCevirme.metnitersecevir(str);

        if (str.equals(tersStr)){
            System.out.println("verilen metin palindrome");
        }else System.out.println("verilen metin palindrome degil");
    }
}
