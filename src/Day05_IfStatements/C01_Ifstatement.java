package Day05_IfStatements;

import java.util.Scanner;

public class C01_Ifstatement {
    public static void main(String[] args) {

        // Ogrenciden notu rakam olarak alip harf olarak yazdirin
        //0-49,999 FF
        //50-64,999 CC
        // 65-84,999 BB
        // 85-100 AA
        //int not=56;

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen notunuzu gririniz");
        double not = scan.nextDouble();

        if (0<=not && not<50){
            System.out.println("Notunuz FF, malesef kaldiniz");
        }

        if (50<=not && not<65){
            System.out.println("Notunuz CC, tebrikler gectiniz");
        }
        if (65<=not && not<85){
            System.out.println("Notunuz BB, Tebrikler Gectiniz");
        }
        if (86<=not && not<=100){
            System.out.println("Notunuz AA Tebrikler Gectiniz");
        }
    }
}
