package Day06_IfElseStatements;

import java.util.Scanner;

public class C05_IfElseIf {
    public static void main(String[] args) {
        // ornek
        //ogrencinin notu 85 ve ustu ise "AA"
        //ogrencinin notu 65 ve ustu ise "BB"
        //ogrencinin notu 50 ve ustu ise "CC"
        //Geriye kalanlar "DD"

        Scanner scan=new Scanner(System.in);
        System.out.println("Notunuzu Griniz");
        double not= scan.nextDouble();

        if (not<0 || not>100){
            System.out.println("gecersiz not");
        } else if (not>=85) {
            System.out.println("Notunuz AA");
        } else if (not>=65) {
            System.out.println("Notunuz BB");
        } else if (not>=50) {
            System.out.println("Notunuz CC");
        }else {
            System.out.println("Notunuz DD kaldiniz");
        }
    }
}
