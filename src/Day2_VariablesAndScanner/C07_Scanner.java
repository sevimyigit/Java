package Day2_VariablesAndScanner;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("lutfen isminizi griniz");

        String girilenIsim= scan.nextLine();

        System.out.println("Lutfen soyimisnizi giriniz");
        String girilenSoyisim= scan.nextLine();
        System.out.println("Lutfen Yasinizi giriniz");
        int girilenYas= scan.nextInt();

        System.out.println("isminiz : "+girilenIsim +
                            "\nsoyisminiz :" +girilenSoyisim+
                             "\nyasiniz :"+girilenYas +
                             "\nkaydiniz basariyla tamamlanmistir.");


    }
}
