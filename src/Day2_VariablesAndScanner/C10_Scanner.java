package Day2_VariablesAndScanner;

import java.util.Scanner;

public class C10_Scanner {
    public static void main(String[] args) {
        /* kullanican bir double ve int sayi alip bunlarin toplamini ve carpimini
         yazdirin  */

        Scanner scan = new Scanner(System.in);

        System.out.println("lutfen bir ondalikli sayi girin");
        double sayidbl = scan.nextDouble();
        System.out.println("Lutfem bir tamsayi girin");
        int sayiint= scan.nextInt();

        System.out.println("sayilarin toplami:"+(sayidbl+sayiint));
        System.out.println("sayilarin carpimi:"+sayidbl*sayiint);

    }
}
