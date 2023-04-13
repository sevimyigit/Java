package Day09_StringManipulations;

import java.util.Scanner;

public class C06_indexOf {
    public static void main(String[] args) {
        // kullanicidan aaldiginiz cumle "cok ile baslayan ilk kelimesinni yazdirin
        //Cumlede cok kelimesi gecmiyorsa cumlede cok ile baslayan kelime yok yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("bir cumle giriniz");
        String girilenCumle=scan.nextLine();

        // Sinavlarimizda cokdan secmeli sorular kullaniyoruz
        // javayi cok seviyoruz
        // bu kadar coklu secenek olur mu ?

        if (girilenCumle.contains("cok")){
            System.out.println("cumlede cok ile baslayan kelime yok");
        }else {
            int cokindexi=girilenCumle.indexOf("cok");
            int boslukindexi=girilenCumle.indexOf("",cokindexi+1);

            System.out.println(girilenCumle.substring(cokindexi, boslukindexi));
        }
    }
}
