package Day32_sets_maps;

import java.util.HashMap;
import java.util.Map;

public class C06_Value {

    public static void main(String[] args) {

        //map olustur methodu bze bir map dondurur
        //biz o class daki map i kullanmak istiyoruz ama
        //her seferinde o seferinde o map i yeniden olusturmamiz isimize yaramaz

        //Bu class da bir map olusturmak istedigimizde
        //new HashMap<>() yaziyoruz
        //Ancak bu bize bos bir Map geetirir
        //Bu kodun yerine MapMethodDepo dan ogrencimap olustur methodunu calistirirsak
        //bize dolu bir map getirir
        //bizde onu icinde oldugumuz class da olsuturdugumuz ogrenciMap a atama yapariz

        Map<Integer,String > ogrenciMap=MapMethodDepo.ogrenciMapOlustur();
        ogrenciMap.put(110,"Cemal-Han-12-M-MF");

        System.out.println(ogrenciMap);

        System.out.println(ogrenciMap.keySet());
        //[101, 102, 103, 104, 105, 106, 110]

        System.out.println(ogrenciMap.values());
        //[Ali-Can-11-H-MF, Veli-Cem-10-K-TM, Ali-Cem-11-K-TM, Ayse-Cem-10-H-MF, Sevgi-Cem-11-M-TM, Sevgi-Can-10-K-MF, Cemal-Han-12-M-MF]

        //verilen ismin ogrenciMap de olup olmadigini kontrol edip
        // true-false donen method olusturun.

        boolean sonuc=MapMethodDepo.isimileOgrenciArama(ogrenciMap,"Ali");
        System.out.println(sonuc); // true
        System.out.println(MapMethodDepo.isimileOgrenciArama(ogrenciMap, "Kemal")); //false
        System.out.println(MapMethodDepo.isimileOgrenciArama(ogrenciMap, "Cem")); //false


    }
}
