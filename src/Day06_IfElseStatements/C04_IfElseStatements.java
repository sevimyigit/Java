package Day06_IfElseStatements;

import java.util.Scanner;

public class C04_IfElseStatements {
    public static void main(String[] args) {

        /*
        Soru: Kullanican bir karakter girmesini isteyin
             Girilen Karakterin buyuk harf olup olmadigiini yazdirin
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir harf gir");
        char krk=scan.next().charAt(0);

        if (krk>='A'&& krk<='Z'){
            System.out.println("Girilen Harf Buyuk Harf");
        }else {
            System.out.println("Girilen Harf Buyuk Harf Degil");
        }

    }
}
