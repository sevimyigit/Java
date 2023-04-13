package Day33_Maps;

import Day32_sets_maps.MapMethodDepo;

import java.util.Map;

public class C07_SinifaGoreSiraliListeYazdir {
    public static void main(String[] args) {

        //tum ogrenci listesini
        //sinif sube isim soyisim no seklinde
        //kucukten dogal sirali olarak
        //yazdiran bir method olusturun

        Map<Integer,String> ogrencimap= MapMethodDepo.ogrenciMapOlustur();

        MapMethodDepo.sinifSiraliListeYazdir(ogrencimap);
    }
}
