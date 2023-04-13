package Day11_ForLoops;

import java.util.Scanner;

public class C05_ForLoop {
    public static void main(String[] args) {
        /* kullanicidan baslangic ve bitis degeri pozitif sayilar alin
           Sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin
           Bitis degeri baslangic degerinden kucukse,uyari yazdirip islemi sonlandirin
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen baslangic ve bitis degeleri icin iki pozitif tam sayi giriniz");

        int baslangic=scan.nextInt();
        int bitis=scan.nextInt();

        if (bitis<baslangic){
            System.out.println("baslangic degeri bitis degerinden kucuk olmali");
        }else {
            int toplam=0;

            for (int i = baslangic; i <=bitis ; i++) {
                toplam+=i;

            }System.out.println(baslangic + " ile " + bitis + " arasindaki sayilarin toplami : " + toplam);

    }
}}
