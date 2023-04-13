package Day05_IfStatements;

import java.util.Scanner;

public class C05_IfStatements {
    public static void main(String[] args) {

        /* Soru-- Kullanicidan bir harf alin
          Harf ile baslayan bir ay varsa yazdirin
          Not:Buyuk harf;kucuk harf ohassasiyeti olmasin.
          Kullanici o veya O yazdiginda Ocak Olsun

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yazdirmak istediginiz ayin ilk harfini girin");

        char ilkharf=scan.next().charAt(0);
        if (ilkharf== 'o'|| ilkharf=='O') System.out.println("Ocak");
        if (ilkharf== 's'|| ilkharf=='S') System.out.println("Subat");
        if (ilkharf== 'm'|| ilkharf=='M') System.out.println("Mart veya Mayis");
        if (ilkharf== 'n'|| ilkharf=='N') System.out.println("Nisan");
        if (ilkharf== 'h'|| ilkharf=='H') System.out.println("Haziran");
        if (ilkharf== 't'|| ilkharf=='T') System.out.println("Temmuz");
        if (ilkharf== 'A'|| ilkharf=='a') System.out.println("Agustos veya Aralik");
        if (ilkharf== 'e'|| ilkharf=='E') System.out.println("Eylul veya Ekim");
        if (ilkharf== 'k'|| ilkharf=='K') System.out.println("Kasim");
    }
}
