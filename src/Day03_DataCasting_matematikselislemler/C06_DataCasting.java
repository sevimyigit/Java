package Day03_DataCasting_matematikselislemler;

import java.util.Scanner;

public class C06_DataCasting {
    public static void main(String[] args) {
        // kullanicidan bir double bir tam sayi alin
        //double sayiyi ikinci sayiya bolun
        //ve bolme isleminin sonucunu tamsayi yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir ondalikli sayi giriniz");
        double sayidbl= scan.nextDouble();

        System.out.println("lutfen bir tamsayi giriniz");
        int sayiintl= scan.nextInt();

        System.out.println((int)(sayidbl/sayiintl)); //sonucu double yazdirir
    }
}
