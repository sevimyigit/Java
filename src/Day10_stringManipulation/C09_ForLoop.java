package Day10_stringManipulation;

import java.util.Scanner;

public class C09_ForLoop {
    public static void main(String[] args) {

        //Kullanicidan baslangic ve bitis degerleri alip
        //bu sinirlar dahil olarak , bu sayilar arasinda 5 in kati olan sayilarir yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Baslangic degerini giriniz");
        int baslangic = scan.nextInt();
        System.out.println("Bitis degeri giriniz");
        int bitis = scan.nextInt();

        for (int i = baslangic; i <= bitis; i++) {
            if (i % 5 == 0) {
                System.out.print(i +" ");

            }
        }
    }}
