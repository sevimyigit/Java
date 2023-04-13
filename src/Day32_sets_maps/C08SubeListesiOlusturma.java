package Day32_sets_maps;

import java.util.Map;

public class C08SubeListesiOlusturma {

    public static void main(String[] args) {
        //verilen sinif ve sube ismi ile sinif listesini yazdiran method olusturun

        Map<Integer,String > ogrenciMap=MapMethodDepo.ogrenciMapOlustur();

        MapMethodDepo.sinifListesiyYazdirma(ogrenciMap,"11");
    }
}
