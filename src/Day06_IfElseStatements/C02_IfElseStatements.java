package Day06_IfElseStatements;

import java.util.Scanner;

public class C02_IfElseStatements {
    public static void main(String[] args) {
        /* soru :   Kullanicadan bir ucgenin 3 kenar uzunlugunu alin,
        ucgen ikiz kenar ise "ikizkenar ucgen" yazdirin , degilse "ikiz kenar degil" yazdirin
        herdeger icin mutlaka kodumuzda bir body calisir
         */

        Scanner scan = new Scanner(System.in);

        double kenar1 = scan.nextDouble();
        double kenar2 = scan.nextDouble();
        double kenar3 = scan.nextDouble();

        if ((kenar1 == kenar2 && kenar1 != kenar3) ||
           (kenar2 == kenar3 && kenar2 != kenar1) ||
           (kenar3 == kenar1 && kenar3 != kenar2)) {
            System.out.println("ikizkenar ucgen");
        } else {
            System.out.println("ikizkenar ucgen degildir");
        }
    }}
