package Day12_MethodCreation;

import java.util.Scanner;

public class C05_HesapMakinesi {
    public static void main(String[] args) {
        //kullanicidan iki sayi ve istedigi islemi alin (+,/,*,-)
        //bir method olusturup sayilari istenen islemi uygulayip sonucu bize dondurun

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 2 sayi gitin ");
        double sayi1=scan.nextDouble();
        double sayi2=scan.nextDouble();

        System.out.println("lutfen bir islem girin+,-,/,*");
        char islem=scan.next().charAt(0);

        System.out.println(hesapmakinasi(sayi1, sayi2, islem));

    }

    public static double hesapmakinasi(double sayi1,double sayi2, char islem){

        switch (islem){
            case '+':
                return sayi1+sayi2;
            case '-':
                return sayi1-sayi2;
            case '/':
                return sayi1/sayi2;
            case '*':
                return sayi1*sayi2;
            default:
                return 0;
        }
    }

}
