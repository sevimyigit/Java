package Day33_Maps;

import Day32_sets_maps.MapMethodDepo;

import java.util.Map;

public class C04BolumListesiYazdirma {

    public static void main(String[] args) {
        //verilen bolumdeki ogrencilerin
        //no, isim soyisim ve siniflarini yazdiran
        //bir method olusturun

        Map<Integer,String> ogrenciMap= MapMethodDepo.ogrenciMapOlustur();

        MapMethodDepo.bolumlistesiolusturma(ogrenciMap,"MF");
    }
}
