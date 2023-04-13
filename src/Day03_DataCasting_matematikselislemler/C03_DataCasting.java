package Day03_DataCasting_matematikselislemler;

import java.util.Scanner;

public class C03_DataCasting {
    public static void main(String[] args) {

        System.out.println(28/5); //5.3

        System.out.println(29/3); // 9.666

        //Java bir bolme isleminde 2 it isleme giriyorsa sonucu int olarak verir
        int sayi1=25;
        int sayi2=6;
        System.out.println(sayi1/sayi2);

        double dbl=6;

        System.out.println(sayi1/dbl);

        // kullanicidan 2 tam sayi alin. 1. tam sayiyi 2.ye bolup sonucu 10 dalik olarak yazdirin

        Scanner scan =new Scanner(System.in);
        System.out.println("lutfen biribine bolmek icin iki tam sayi giriniz");

        int ilksayi= scan.nextInt();
        int ikincisayi=scan.nextInt();

        System.out.println("iki sayinin bolme sonucu :"+ ilksayi/(double) ikincisayi);
    }
}
