package Day2_VariablesAndScanner;

import java.util.Scanner;

public class C09_Scanner {
    public static void main(String[] args) {

        /* kullanicadan 2 sayi alip ikisiin degerlerini degistiirin (swap)
           kullanicinin girdigi degerler
            sayi1=10 Sayi2+20 ise

            siz kod ile bunlarin degerlerini degistirin
            sayi1=20 sayi2=10 */

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen sayi1 i giriniz");
        int sayi1= scan.nextInt();
        System.out.println("lutfen sayi2 i giriniz");
        int sayi2= scan.nextInt();

        int temp;

        temp=sayi2;

        sayi2=sayi1;

        sayi1=temp;

        System.out.println("sayilarin degerini degistirdim"+
                "\nSayi1 in yeni degeri : " +sayi1 +
                 "\nsayi2 nin yeni degeri: "+sayi2);




    }
}
