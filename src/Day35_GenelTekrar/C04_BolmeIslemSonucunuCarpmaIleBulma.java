package Day35_GenelTekrar;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C04_BolmeIslemSonucunuCarpmaIleBulma {

    public static void main(String[] args) {

        //Kullanicidan bolunecek sayi ve bolecek sayiyi aip
        //bolme isleminin sonucunu, carpma islemi ile bulan ve yazdiran bir method olusturun
        //bu islemi kullanici Q ya basincaya kadar devam ettirin

        Scanner scan=new Scanner(System.in);
        boolean devamEdelimMi=true;
        int bolunecekSayi=1;
        int bolenSayi=1;

        do{
            System.out.println("Lutfen bolunecek tamsayiyi gitin ,\nbitirmek icin Q'ya basin");

            try {
                bolunecekSayi=scan.nextInt();
                System.out.println("Lutfen bolecek sayiyi giriniz");
                bolenSayi= scan.nextInt();
                bolumsonucuYazdir(bolunecekSayi,bolenSayi);

            } catch (InputMismatchException e) {

                String girilenStr=scan.nextLine();
                if (girilenStr.equalsIgnoreCase("q")){
                    devamEdelimMi=false;

                }else {
                    System.out.println("Bolunecek sayi tamsayi olmalidir");
                }

            }

        } while (devamEdelimMi);
    }

    private static void bolumsonucuYazdir(int bolunecekSayi, int bolenSayi) {

        int sonucIsareti=1;

        if (bolunecekSayi*bolunecekSayi<0){
            sonucIsareti=-1;
        }
        bolunecekSayi=bolunecekSayi>=0 ? bolunecekSayi :bolunecekSayi*(-1);
        bolenSayi=bolenSayi>=0 ? bolenSayi : bolenSayi*(-1);

        int bolumsonucu=1;

        while (bolumsonucu*bolenSayi<bolunecekSayi){
            bolumsonucu++;
        }
        if (bolumsonucu*bolenSayi==bolunecekSayi){
        System.out.println("bolme isleminin sonucu : " + bolumsonucu*sonucIsareti);
        } else
            System.out.println("bolme isleminin sonucu : " +( bolumsonucu-1)*sonucIsareti);


    }
}
