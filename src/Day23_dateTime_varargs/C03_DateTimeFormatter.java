package Day23_dateTime_varargs;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C03_DateTimeFormatter {
    public static void main(String[] args) {
        LocalDateTime ldt=LocalDateTime.now();
        System.out.println(ldt); // 2022-12-21T21:24:09.054559
        // Sadece tarihi 21/12/2022 olarak yazdiralim
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/YYYY");
        System.out.println(ldt.format(format1)); // 21/12/2022
        // Sadece tarihi 12.21.22 Tue seklinde yazdirin
        DateTimeFormatter format2= DateTimeFormatter.ofPattern("MM.dd.yy EEE");
        System.out.println(ldt.format(format2)); // 12.21.22 Wed
        // Sadece zamani  00:00 am olarak yazdirin
        DateTimeFormatter format3= DateTimeFormatter.ofPattern("hh:mm a");
        System.out.println(ldt.format(format3)); // 09:24 pm
        /*
         format olustururken
         GUN
         d : basta 0 varsa onu yazmadan gun numarasi
         dd: tek haneli gunleri 01 gibi basina sifir yazarak gun numarasi
         DDD : yilin kacinci gunu oldugunu yazar
         E, EE, EEE : gun isminin ilk 3 harfi
         EEEE : gun isminin tamamini

         AY (Ay icin M, dakika icin m kullanilir)
         M : basta 0 varsa onu yazmadan ay numarasi
         MM: tek haneli aylari 01 gibi basina sifir yazarak ay numarasi
         MMM : Ay isminin ilk 3 harfi
         MMMM : Ay isminin tamami

         YY : yilin son iki rakamini
         YYYY : Yilin tamamini
         Saat : (24 saat uzerinden istiyorsak H, 12 saat duzeninde istiyorsak h)
         HH : saatin tamami, tek rakamli saat olursa 02 gibi
         H  : tek rakamli saat olursa sadece saati
         m : minute
         a yazarsak AM veya PM degerini yazar
         */
    }
}
