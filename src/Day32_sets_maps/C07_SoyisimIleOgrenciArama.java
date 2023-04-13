package Day32_sets_maps;

import java.util.Map;

public class C07_SoyisimIleOgrenciArama {

    //ogrenciMap de aradigimiz soyisim'deki ogrencilerin
    //isim,Soyisim,Sinif ve Sube bilgilerini bir tablo olarak
    // yazdiran bir method olusturun

    public static void main(String[] args) {
        Map<Integer,String > ogrenciMap=MapMethodDepo.ogrenciMapOlustur();

        MapMethodDepo.soyisimIleogrenciListesiYazdirma(ogrenciMap,"Cem");
    }
}
