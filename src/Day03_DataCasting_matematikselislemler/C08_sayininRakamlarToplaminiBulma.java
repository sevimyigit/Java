package Day03_DataCasting_matematikselislemler;

import java.util.Scanner;

public class C08_sayininRakamlarToplaminiBulma {
    public static void main(String[] args) {
        // Kullanicidan 4 basamakli pozitif bir tam sayi alin
        //sayinin rakamlar toplamini bulun
     /*
        int girilensayi=1579;
        int birlerBasamagi=girilensayi%10;
        System.out.println("birlerBasamagi :" +birlerBasamagi);
        girilensayi=girilensayi/10;
        System.out.println(girilensayi);
        System.out.println(girilensayi);

        birlerBasamagi=girilensayi%10;
        System.out.println("birlerBasamagi :" +birlerBasamagi);
        girilensayi=girilensayi/10;
        System.out.println(girilensayi);
        System.out.println(girilensayi);

        birlerBasamagi=girilensayi%10;
        System.out.println("birlerBasamagi :" +birlerBasamagi);
        girilensayi=girilensayi/10;
        System.out.println(girilensayi);
        System.out.println(girilensayi);

        birlerBasamagi=girilensayi%10;
        System.out.println("birlerBasamagi :" +birlerBasamagi);
        girilensayi=girilensayi/10;
        System.out.println(girilensayi);
        System.out.println(girilensayi);
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen 4 basamakli bir tamsayi giriniz");

        int girilensayi=scan.nextInt(); // 2457

        int birlerBasamagi=0;
        int rakamlartoplami=0;

        birlerBasamagi=girilensayi%10;//7
        rakamlartoplami=rakamlartoplami+birlerBasamagi; //0+7=7
        girilensayi=girilensayi/10; //245

        birlerBasamagi=girilensayi%10;//5
        rakamlartoplami=rakamlartoplami+birlerBasamagi; //7+5=12
        girilensayi=girilensayi/10;

       birlerBasamagi=girilensayi%10;//4
        rakamlartoplami=rakamlartoplami+birlerBasamagi; //12+4=16
        girilensayi=girilensayi/10;

        birlerBasamagi=girilensayi%10;//2
        rakamlartoplami=rakamlartoplami+birlerBasamagi; //16+2=18
        girilensayi=girilensayi/10;


        System.out.println("girilen sayinin rakamlar toplami :"+rakamlartoplami);









    }
}
