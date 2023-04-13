package Day03_DataCasting_matematikselislemler;

import java.util.Scanner;

public class C04_CharDataCasting {
    public static void main(String[] args) {

        /*
         Char ozel bir data turudur
         eger matematiksel bir islemde  char data turunden bir deger kullanirsaniz
         Java o char'in ascii degerini goz onunde bulundururak google da desible tablosu mevcut
        */

        System.out.println('a'+'b'); //195

        System.out.println('a'-32);
        //'a' -32 nin char olarak sonucunu yazdir

        System.out.println((char) ('a'-32)); //ascii table A=65

        //kullanicidan bir char alip
        // ascii table den kullanicinin girdigi char in sonrasindaki
        //3 karakteri yazdirin
        // ornek input :a output:b,c,d

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir karakter giriniz ");
        char girilenKarakter=scan.next().charAt(0);

        System.out.println((char)(girilenKarakter+1)+","+
                (char) (girilenKarakter+2)+","+
                (char) (girilenKarakter+3));



    }
}
