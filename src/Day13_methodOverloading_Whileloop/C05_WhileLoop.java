package Day13_methodOverloading_Whileloop;

import java.util.Scanner;

public class C05_WhileLoop {
    public static void main(String[] args) {
        //kullanicidan toplamak uzere iki sayi alin
        //girilen sayilarin toplami 500 olur veya gecerse
        //bu kadar sayi yetr deyip toplami yazdirin

        //soruyu for loop ole yapalim dersek
        //adim sayisini tahmin edip biraz abartabiliriz

        Scanner scan=new Scanner(System.in);
        int toplam=0;
        int sayi=0;

        for (int i = 1; i <1000; i++) {
            System.out.println("toplamak uzere tamsayi giriniz");
            sayi=scan.nextInt();

            toplam+=sayi;

            if (toplam>=500){
                System.out.println("Bu kadar sayi yeter , toplamlari  =" +toplam);
            }

        }

        // ayni soruyu while loop ile yapalim
        toplam=0;
        while (toplam<500){

            System.out.println("toplamak uzere tamsayi giriniz");
            sayi=scan.nextInt();

            toplam+=sayi;
    }
        System.out.println("Bu kadar sayi yeter , toplamlari  =" +toplam);
}}
