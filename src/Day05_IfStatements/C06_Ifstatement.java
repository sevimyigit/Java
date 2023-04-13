package Day05_IfStatements;

import java.util.Scanner;

public class C06_Ifstatement {
    public static void main(String[] args) {

        /* Kullanican bir ucgenin uc kenar uzunlugunu alin
        Ucgen eskenar ise "Eskenar ucgen" yazdirin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen ucgenin uc kenar uzunlugunu giriniz");
        double kenar1=scan.nextDouble();
        double kenar2=scan.nextDouble();
        double kenar3=scan.nextDouble();

        if (kenar1==kenar2 && kenar2==kenar3 && kenar1>0)
        {System.out.println("eskenar ucgen");
        } else {
            System.out.println("eskenar ucgen degildir");
    }
}}
