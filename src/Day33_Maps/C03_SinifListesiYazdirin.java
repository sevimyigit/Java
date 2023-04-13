package Day33_Maps;

import Day32_sets_maps.MapMethodDepo;

import java.util.Map;

public class C03_SinifListesiYazdirin {

    public static void main(String[] args) {

        //verilen siniftaki ogrencilerin no,isim,soyisim , bolumlerini
        //bir liste olarak yazdiran bir method olusturun

        Map<Integer,String> ogrenciMap=MapMethodDepo.ogrenciMapOlustur();


        MapMethodDepo.sinifListesiyYazdirma(ogrenciMap, "10");
    }
}
