package Day09_StringManipulations;

import java.util.Scanner;

public class C04_endsWith {
    public static void main(String[] args) {
        String str= "Java ogrenen issiz kalmaz";

        System.out.println(str.endsWith("kalmaz")); // true
        System.out.println(str.endsWith("Java ogrenen issiz kalmaz")); // true
        System.out.println(str.endsWith("")); // true
        System.out.println(str.endsWith("z")); //true

        /* soru ==> Kullanicidan bir mail alin
        mail@ icermiyorsa "gecersiz mail" yazdirin
        mail @gmail.com icermiyorsa, "mail gmail olamli"
        mail @gmail.com ile bitmiyorsa "mailde yazim hatasi var" yazdirin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen emailinizi giriniz");

        String girilenmail=scan.nextLine();
        if (!girilenmail.contains("@")){
            System.out.println("gecersiz mail");
        } else if (!girilenmail.contains("@gmail.com")) {
            System.out.println("mail gmail olmali");
        } else if (!girilenmail.endsWith("@gmail.com")) {
            System.out.println("mailde yazim hatasi var");
        }


    }
}
