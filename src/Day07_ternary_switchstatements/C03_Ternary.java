package Day07_ternary_switchstatements;

import java.util.Scanner;

public class C03_Ternary {
    public static void main(String[] args) {
        /* input olarak verilen sayi kontrol edip
           sayi cift ise "Cift Sayi"
           degilse "tek sayi" yazdirin
         */

        int input=44;

        //If ELse ile yapalim
        if (input%2==0)
            System.out.println("cift sayi");
        else {
            System.out.println("tek sayi");
    }
     //ternary ile coz
        System.out.println(input%2==0 ? "cift sayi" : "tek sayi");
}}
