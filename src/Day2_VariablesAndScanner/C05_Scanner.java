package Day2_VariablesAndScanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("isminizi Yazin");

        String girilenIsim= scan.nextLine();

        System.out.println(girilenIsim.toUpperCase());

    }
}
