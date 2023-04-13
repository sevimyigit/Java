package Day28_Exceptions;

import java.util.Scanner;

public class C01_TryCatch {
    public static void main(String[] args) {

        //kullanicidan iki tam sayi alip sayilari birbirine bolup sonucu yazdirin


        Scanner scan =new Scanner(System.in);
        System.out.println("Biribirine bolmek icin iki tam sayi giriniz ");

        int sayi1= scan.nextInt();
        int sayi2= scan.nextInt();

        try {
            //1-try bolumu yapmak istedigimiz ama exception riski olusturan kodlar
            System.out.println("iki sayinin bolumu :"+ sayi1/sayi2);
        } catch (Exception e)
            //2-catch{} : bekledigimiz muhtemel exception ve
              //bu exception gerceklestirilirse hata dokumani store edevilecegimiz variable
        {
            System.out.println("Bolecek sayi 0 olamaz");
            e.printStackTrace();
            //3-catch vlogu : exception gerceklesirse calismasini istedigimiz kodlar
            //                burayi yazarken oncelikle
            //                exp/olustugunda kodlarin calismasi dursun mu? yoksa devam mi etsin
            //                karar vermezliyiz
        }
    }
}
