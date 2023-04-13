package Day28_Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_TryCatch {
    public static void main(String[] args) {
        // Kullanicidan toplamak uzere sayilar alin
        // kullanicinin islemi bitirmesi icin Q'ya basmasini isteyin
        // kullanici Q'ya bastiginda toplam kac sayi girdigini
        // ve bu sayilarin toplaminin kac oldugunu yazdirin


        Scanner scan=new Scanner(System.in);
        int girilensayi=0;
        int sayiadedi=0;
        int sayilartoplami=0;
        while (sayiadedi<10000)
        try {

                System.out.println("toplamak icin tamsayi girin " +
                        "\nBitirmek icin Q'ya basin ");

                girilensayi= scan.nextInt();
                sayilartoplami+=girilensayi;
                sayiadedi++;


        } catch (InputMismatchException e) {
            String girilendeger= scan.nextLine();

            if (girilendeger.equalsIgnoreCase("q")){
                System.out.println("Girilen " + sayiadedi+ " sayinin toplami :" + sayilartoplami);
                break;
            }else {
                System.out.println("gecersiz input");
            }
        }
    }
}
