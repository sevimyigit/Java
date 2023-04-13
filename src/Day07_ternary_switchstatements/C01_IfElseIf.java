package Day07_ternary_switchstatements;

import java.util.Scanner;

public class C01_IfElseIf {
    public static void main(String[] args) {
        /* kullanicidan bir tam sayi alin
           sayi rakam ise (0-9) "girilen sayi rakam"
           sayi iki basamakli ise "girilen sayi iki basamakli"
           sayi iki basamaktan buyuk ise "butuk sayi" yazdirin

           Eger if Else cumleleri ELse ile bitmiyorsa
           tum durumlari kapsamaz
           yani bazi degerler icin bir if body si calismayabilir

           Bu tur sorulari cozerken
           sartlarin tamamini dikkatli yazmak gerekir
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");
        int girilenSayi= scan.nextInt();

        if (0<=girilenSayi && girilenSayi<=9) System.out.println("girilen sayi rakam");
        else if (10<=girilenSayi && girilenSayi<=99) System.out.println("girilen sayi iki basamakli");
        else if (girilenSayi>=100) System.out.println("buyuk sayi");
            
        }

    }
