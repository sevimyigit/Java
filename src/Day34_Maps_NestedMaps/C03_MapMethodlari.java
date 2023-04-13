package Day34_Maps_NestedMaps;

import Day32_sets_maps.MapMethodDepo;

import java.util.Map;

public class C03_MapMethodlari {

    public static void main(String[] args) {

        Map<Integer,String> ogrenciMap=MapMethodDepo.ogrenciMapOlustur();

        System.out.println(ogrenciMap.containsValue("Ali")); // false
        // value degeri butunu kapsarsa true sadece bir kismi kapsarsa false doner

        System.out.println(ogrenciMap.getOrDefault(103, "Ogrenci Bulunamadi"));
          //Ali-Cem-11-K-TM
        System.out.println(ogrenciMap.getOrDefault(123, "ogrenci bulunamadi"));
        //ogrenci bulunamadi

        System.out.println(ogrenciMap.get(123)); //null

        ogrenciMap.replace(103,"Ali-Cem-11-K-MF");

        System.out.println(ogrenciMap.get(103));

        System.out.println(ogrenciMap.replace(123, "Ali-Cem-11-K-MF")); //null

        System.out.println(ogrenciMap);

        ogrenciMap.replace(103,"Ali-Cem-11-K-MF","\"Ali-Han-11-K-MF\"");
        System.out.println(ogrenciMap.get(103)); // "Ali-Han-11-K-MF"

        ogrenciMap.replace(103,"Ali-Cem-11-K-MF","\"Kemal-Han-11-K-MF\"");
        System.out.println(ogrenciMap.get(103)); // "Ali-Han-11-K-MF"

        //kontrol eder eski value verilen deger ile ayni ise degistirir degislse ayni kalir



    }
}
