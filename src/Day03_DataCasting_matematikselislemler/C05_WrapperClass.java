package Day03_DataCasting_matematikselislemler;

import java.util.Scanner;

public class C05_WrapperClass {
    public static void main(String[] args) {
        int sayi=10;
        String str="Java Candir";
                /*
                int primitive oldugundan hazir methodlari yoktur
                String ise non-primitive oldugundan hazir methodlara sahiptir

                int,char,boolean gibi primite variable turlerinden hazir method kullanmak icin
                Java Integer , Character ,Boolean gibi wrapper classlar olusturmustur
                Bunlarin primitive ler ile ayni degerleri olabilir ancak methodlari vardir

                 */

        Integer sayi2=20;
        /*
        islemlerimizi yaparken bazen String olarak tanimlamis
        ancak matematiksel icerik barindiran variable'lar ile karsilasabiliriz
        Bu durumda bu tur String variable lari sayiya cevirme ihtiyacimiz

        Eger sayiya cevirmek istedigimiz metinlerde harf ve sayi olmayan baska karakter varsa Java hata verir.

        method adi=Integer.parseInt()

        integer.method.sout yazip method aciklamasi ya da degeri gorebilirsin
         */

        String str2="123";
        String str3="354";
        System.out.println(str2+str3);

        int str2int=Integer.parseInt(str2);
        int str3int=Integer.parseInt(str3);

        System.out.println(str2int+str3int);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println(Short.MAX_VALUE);

        char krk1='a';
        System.out.println(Character.isDigit(krk1));
        System.out.println(Character.isLetter(krk1));
        System.out.println(Character.isAlphabetic(krk1));
        System.out.println(Character.isLetterOrDigit(krk1));


    }
}
