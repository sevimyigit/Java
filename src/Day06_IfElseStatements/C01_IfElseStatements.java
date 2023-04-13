package Day06_IfElseStatements;

import java.util.Scanner;
/* if ile baslayan bir kod else ile bityorsa input un tum degerlerini kapsar */
public class C01_IfElseStatements {
    public static void main(String[] args) {
        /* soru :   Kullanicadan bir ucgenin 3 kenar uzunlugunu alin,
        ucgen eskeanr ise "eskenar ucgen" yazdirin , degilse "eskenar degil" yazdirin
        herdeger icin mutlaka kodumuzda bir body calisir
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen 3 kenar uzunlugu yazin");

        double kenar1 = scan.nextDouble();
        double kenar2 = scan.nextDouble();
        double kenar3 = scan.nextDouble();

        if (kenar1 == kenar2 && kenar2 == kenar3 && kenar1 > 0) {
            System.out.println("Eskenar ucgen");
        }else {
            System.out.println("Eskenar degil");
        }
    }
}
