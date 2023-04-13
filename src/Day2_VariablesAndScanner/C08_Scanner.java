package Day2_VariablesAndScanner;

import java.util.Scanner;

public class C08_Scanner {
    public static void main(String[] args) {

        /* Kullanican bir dikdortgenin 2 kenat uzunlugunu alip ,
        dikdortgenin alanini yazdirin

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen diktorgenin iki kenar uzunlugunu girin");

        double kenar1 = scan.nextDouble();
        double kenar2 = scan.nextDouble();

        System.out.println("diktortgenin alani :"+kenar2+kenar1);
    }
}
