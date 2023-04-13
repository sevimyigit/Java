package Day05_IfStatements;

import java.util.Scanner;

public class C04_IfStatements {
    public static void main(String[] args) {
   /*If cumlelerinde sart {} parentesinden sonra body kullanmazsak ilk noktali virgule kadar olan kismi body olarak kabul
   eder..yani sadece bir satir kodu body olarak kabul eder.

    Eger if body si icin yazilacak kod bir satirdan fazla ise mutlaka {} kullanilmalidir

        Soru-- Kullanicidan bir sayi alin
        sayi 3 ile bolunebiliryorsa "uc ile bolunebilen sayi"
        5 ile bolunebilliyorsa "Bes ile bolunebilen sayi"
         */

        Scanner scan = new Scanner (System.in);
        System.out.println("Lutfen bir tam sayi giriniz");
        int girilensayi= scan.nextInt();

        if (girilensayi%3==0) System.out.println("uc ile bolunebilen sayi");
        if (girilensayi%5==0) System.out.println("bes ile bolunebilen sayi");
    }
}
