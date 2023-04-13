package Day36_GenelTekrar;

import java.util.Scanner;

public class C01_RecursiveMethods {

    //kullanicidan pozitif bir tamsayi alip
    // 0 sayidan sifira kadar olan poztifi sayilari toplayin

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Pozitif bir tam sayi girin");
        int sayi= scan.nextInt();

        toplaForloop(sayi);
        toplaRecursive(sayi);
        System.out.println("recursive toplam : " +toplaRecursive(sayi));


    }

    private static int toplaRecursive(int sayi) {
        if (sayi>0){
            return (sayi + toplaRecursive(sayi-1));
        }else {
            return sayi;
        }
    }

    private static void toplaForloop(int sayi) {
        int toplam=0;

        for (int i = 0; i <=sayi ; i++) {
            toplam+=i;

        }
        System.out.println("Toplam for loop ile : " +toplam);
    }
}
