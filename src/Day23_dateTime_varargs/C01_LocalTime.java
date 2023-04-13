package Day23_dateTime_varargs;

import java.time.LocalTime;

public class C01_LocalTime {
    public static void main(String[] args) {

        LocalTime zaman=LocalTime.now();
        System.out.println(zaman);

        System.out.println(zaman.getMinute());
        System.out.println(zaman.withSecond(0).withNano(0));
        System.out.println(zaman.withSecond(1).withNano(1));

        System.out.print(zaman.plusHours(100).plusMinutes(250));

        // bir for loop ile birden 10000'e kadar olan sayilari yanyana yazdirin
        //bu islem icin gecen zamani bulun
        System.out.println(" ");
        LocalTime baslangiczamani=LocalTime.now();
        System.out.println(" baslangic " +baslangiczamani); //20:53:01.000000001
        for (int i = 1; i <=10000; i++) {
            System.out.print(i+" ");

        }
        LocalTime bitiszamani=LocalTime.now();
        System.out.println("------ ");
        System.out.println("bitis " +bitiszamani);//bitis 20:53:09.080963600

        System.out.println("islem suresi : " +
                (bitiszamani.getNano()- baslangiczamani.getNano())+ " nano saniye"); //islem suresi : 49701200 nano saniye

          /*
            Olusturdugumuz time veya date guncel zamani veya tarihi tutmaya devam eden bir sayac degil
            olusturdugumuz satirdaki zamani veya tarih'i sistemden alip kaydeden bir variable'dir

            ilerleyen satirlarda guncel zaman veya tarihe ihtiyacimiz oldugunda
            yeni bir time veya date objesi olusturup
            o andaki degeri alabiliriz.
         */
    }
}
