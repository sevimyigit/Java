package Day04_Increment_Concatenation;

public class C01_Pre_Postincrement {
    public static void main(String[] args) {

        int sayi=20;
     // sayiyi 3 arttirin 3 sekilde
        sayi=sayi+3;
        sayi +=3;

        sayi ++;
        sayi ++;
        sayi ++;
        System.out.println(sayi); //sayi=29

        //sayinin degerini azaltin

        sayi=sayi-2;
        sayi -= 2;

        sayi--;
        sayi--;

        System.out.println(sayi); //sayi=23

        sayi=10;

        //sayinin degerini 1 azaltin ve yazdirin

        sayi--;
        System.out.println(sayi);

        //sayinin degeri 10 olsun

        sayi=10;

        //sayiyi yazdirin sonra 1 azaltin

        System.out.println(sayi);
        sayi--;

        sayi=10;
        System.out.println(sayi++);

        System.out.println(sayi);

        //Java ayni satirda iki islem oldugundan siralama yapar
        //Eger ++ variable'dan sonra arttirma islemini sonra yapar
        //bu durumda once yazdirma sonra arttirma islemi yapar

        sayi=10;
        System.out.println(++sayi);
        //++variable'dan once ise arttirma islemini once yapar
        //bu durumda java once arttirma sonra yazdirma islemi yapar
        System.out.println(sayi);
    }
}
