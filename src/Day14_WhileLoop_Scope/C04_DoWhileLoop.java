package Day14_WhileLoop_Scope;

import java.util.Scanner;

public class C04_DoWhileLoop {
    public static void main(String[] args) {

        //Soru 3- Kullanicidan bir pozitif sayi isteyin,
        // sayının tam kare olup olmadığını bulunuz,
        // tamkare ise true değilse false yazdırınız.
        //  Ornek :  input : 16, output: 4

       int input=144;
       int karakok=1;
       boolean sonuc=false;

       while (karakok*karakok <= input){
           if(karakok*karakok==input){
               System.out.println("Girilen sayinin karkoku :" +karakok);
               sonuc=true;
              break;
           }else {
               karakok++;

           }

       }

        System.out.println(sonuc);


       //do whileloop ile yapalim

        input=144;
        karakok=1;
        sonuc=false;
        do {
            if(karakok*karakok==input){
                System.out.println("Girilen sayinin karkoku :" +karakok);
                sonuc=true;
                break;
            }else {
                karakok++;

            }

        }while (karakok*karakok<=input);

        System.out.println(sonuc);
    }

}
