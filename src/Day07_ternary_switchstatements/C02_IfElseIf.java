package Day07_ternary_switchstatements;

import java.util.Scanner;

public class C02_IfElseIf {
    public static void main(String[] args) {
         /* kullanicidan bir tam sayi alin
           sayi negatif ise Negatif sayi
           sayi rakam ise (0-9) "girilen sayi rakam"
           sayi iki basamakli ise "girilen sayi iki basamakli"
           sayi iki basamaktan buyuk ise "butuk sayi" yazdirin
          */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");
        int sayi=scan.nextInt();

        if (sayi<=0) System.out.println("Negatif sayi");
        else if (sayi<=9) System.out.println("girilen sayi rakam");
        else if (sayi<=99) System.out.println("girilen sayi  basamakli");
        else System.out.println("buyuk sayi");



    }
}
