package Day34_Maps_NestedMaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C01_NestedOgrenciMap {

    public static void main(String[] args) {
        Map<Integer,Map<String,String>> ogrenciMap=new HashMap<>();

        ;
        Map<String,String> ogrenci101=new HashMap<>();
        ogrenci101.put("isim","Ali");
        ogrenci101.put("soyisim","Can");
        ogrenci101.put("sinif","11");
        ogrenci101.put("sube","H");
        ogrenci101.put("bolum","MF");


        Map<String,String> ogrenci102=new HashMap<>();
        ogrenci102.put("isim","Veli");
        ogrenci102.put("soyisim","Cem");
        ogrenci102.put("sinif","10");
        ogrenci102.put("sube","K");
        ogrenci102.put("bolum","TM");

        Map<String,String> ogrenci103=new HashMap<>();
        ogrenci103.put("isim","Ali");
        ogrenci103.put("soyisim","Cem");
        ogrenci103.put("sinif","11");
        ogrenci103.put("sube","K");
        ogrenci103.put("bolum","TM");

        ogrenciMap.put(101, ogrenci101);
        ogrenciMap.put(102, ogrenci102);
        ogrenciMap.put(103, ogrenci103);

        System.out.println(ogrenciMap);
        /*
        {101={sinif=11, sube=H, soyisim=Can, bolum=MF, isim=Ali},
         102={sinif=10, sube=K, soyisim=Cem, bolum=TM, isim=Veli},
         103={sinif=11, sube=K, soyisim=Cem, bolum=TM, isim=Ali}}

         */

        //101 numaralli ogrencinin ismini yazdiralim

        System.out.println(ogrenciMap.get(101).get("isim")); //Ali

        // 102 numarali ogrencinin sinif bilgisini yazdirin
        System.out.println(ogrenciMap.get(102).get("sinif")); // 10

        //103 ogrencinin sinifini 12 yapalim

        Set<Map.Entry<Integer, Map<String, String>>> OgrenciEntrySeti= ogrenciMap.entrySet();

        for (Map.Entry<Integer, Map<String, String>> eachogrenciEntry: OgrenciEntrySeti
             ) {
            // 103={sinif=11, sube=K, soyisim=Cem, bolum=TM, isim=Ali}}
            //once ogrenci value sunu kaydetmeliyiz

            if (eachogrenciEntry.getKey()==103){

                Map<String, String> eachogrenciValueMap= eachogrenciEntry.getValue();

                eachogrenciValueMap.put("Sinif","12");

                eachogrenciEntry.setValue(eachogrenciValueMap);
            }


        }

        System.out.println(ogrenciMap);

    }
}
