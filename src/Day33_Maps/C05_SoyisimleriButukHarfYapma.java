package Day33_Maps;

import Day32_sets_maps.MapMethodDepo;

import java.util.Map;

public class C05_SoyisimleriButukHarfYapma {
    public static void main(String[] args) {

        //Map deki soyisimleri buyuk harfe ceviren bir method olsuturun

        Map<Integer,String> ogrencimap= MapMethodDepo.ogrenciMapOlustur();

        ogrencimap=MapMethodDepo.soyisimleriBuyukHarfYap(ogrencimap);

        MapMethodDepo.tumListeYazdir(ogrencimap);

        //11.siniflari yazdir

        MapMethodDepo.sinifListesiyYazdirma(ogrencimap,"11");
    }
}
