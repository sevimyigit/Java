package Day18_arrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C10_Soru {
    public static void main(String[] args) {

        // Soru 2- Kullanicidan istedigi kadar isim alip,
        // Q’ya bastiginda girdigi isimleri bize liste olarak dondurecek bir method olusturun.

        List<String> isimlerListesi=isimListesiOlustur();
        System.out.println(isimlerListesi);
    }

    public static List<String> isimListesiOlustur(){

        List<String > isimListesi=new ArrayList<>();

        String girilenisim="";

        Scanner scan=new Scanner(System.in);

        while (!girilenisim.equalsIgnoreCase("q")){

            System.out.println("Listeye eklemek icin bir isim girin/nBitirmek icin Q 'ya basin");
            girilenisim=scan.nextLine();
            if (!girilenisim.equalsIgnoreCase("q")){
                isimListesi.add(girilenisim);
            }

        }

        return isimListesi;
    }
}
