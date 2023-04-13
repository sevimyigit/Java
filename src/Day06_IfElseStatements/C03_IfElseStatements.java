package Day06_IfElseStatements;

import java.util.Scanner;

public class C03_IfElseStatements {
    public static void main(String[] args) {
        /* soru : Kullanicidan bir harf isteyin
        Harf kucuk ise onu buyuk harf olarak yazdirin yoksa girilen harf olarak yazdirin
         */

        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen bir harf Giriniz");
          char girilenharf=scan.next().charAt(0);

         if (girilenharf>='a'&& girilenharf<='z'){
             System.out.println((char) (girilenharf-32));
             System.out.println(Character.toUpperCase(girilenharf));
         }else {
             System.out.println(girilenharf);
         }



    }}

