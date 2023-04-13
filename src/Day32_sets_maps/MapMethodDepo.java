package Day32_sets_maps;

import java.util.*;

public class MapMethodDepo {

    // bize ogrenciMap donduren bir method olusturun

    public static Map<Integer, String> ogrenciMapOlustur() {


        Map<Integer, String> ogrenciMap = new HashMap<>();

        ogrenciMap.put(101, "Ali-Can-11-H-MF");
        ogrenciMap.put(102, "Veli-Cem-10-K-TM");
        ogrenciMap.put(103, "Ali-Cem-11-K-TM");
        ogrenciMap.put(104, "Ayse-Cem-10-H-MF");
        ogrenciMap.put(105, "Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106, "Sevgi-Can-10-K-MF");

        return ogrenciMap;
    }

    public static boolean isimileOgrenciArama(Map<Integer, String> ogrenciMap, String isim) {
        //1- tum value leri bir collection olarak kaydedlim
        //[Ali-Can-11-H-MF, Veli-Cem-10-K-TM, Ali-Cem-11-K-TM, Ayse-Cem-10-H-MF, Sevgi-Cem-11-M-TM, Sevgi-Can-10-K-MF,]
        Collection<String> valuesCollection = ogrenciMap.values();

        //2-For-each kullanarak her bir value yu ele alalim Ali-Can-11-H-MF
        //3-tre yi kullanarak split yapalim [Ali,Can,11,H,MF]
        //4- Split yaptigimiz array den isim bilgisini alalim  0. index
        //5- Eger value den aldigimiz isim aranan isim ile ayni ise
        //   true dondurup for each i bitirelim
        //6-Eger for-each bittiginde true olmadiysa false dondurelim

        for (String eachvalue : valuesCollection
        ) {
            String[] valueArr = eachvalue.split("-");
            String valudekiIsim = valueArr[0];
            if (valudekiIsim.equalsIgnoreCase(isim)) {
                return true;
            }
        }

        return false;


    }

    public static void soyisimIleogrenciListesiYazdirma(Map<Integer, String> ogrenciMap, String soyisim) {

        //1-map deki value leri bir collection olarak kaydedelim 
        //[Ali-Can-11-H-MF, Veli-Cem-10-K-TM, Ali-Cem-11-K-TM, Ayse-Cem-10-H-MF, Sevgi-Cem-11-M-TM, Sevgi-Can-10-K-MF,
        Collection<String> ogrencivaluecollection = ogrenciMap.values();
        //Listenin ilk satir olarak basliklari yazdiralim 
        System.out.println("Isim Soyisim Sinif Sube");
        //2 -for each ile her biri value bilgisini ele alalim 
        //3- value'u ile split yapip bir array elde edelim [Ali,Can,11,H,MF]
        //4-array in 1. index indeki soy isme bakip aranan soy isim ile ayni ise 
        //isim-soyisim-sinif ve sube bilgilerini yazdiralim 


        for (String eachvalue : ogrencivaluecollection
        ) {
            String[] valueArr = eachvalue.split("-");
            String valuesoyisim = valueArr[1];

            if (valuesoyisim.equalsIgnoreCase(soyisim)) {
                System.out.println(valueArr[0] + " " +
                        valueArr[1] + " " +
                        valueArr[2] + " " +
                        valueArr[3]);
            }


        }


    }

    public static void subeListesiYazdirma(Map<Integer, String> ogrenciMap, String sinif, String sube) {

        Collection<String> valueCollection = ogrenciMap.values();

        System.out.println("Isim Soyisim");

        for (String eacjvalue : valueCollection
        ) {

            String[] valueArr = eacjvalue.split("-");

            if (valueArr[2].equalsIgnoreCase(sinif) && valueArr[3].equalsIgnoreCase(sube)) {
                System.out.println(valueArr[0] + " " + valueArr[1]);
            }

        }
    }

    public static Map<Integer, String> numaraIleSubeDegistirme(Map<Integer, String> ogrenciMap, int okulNo, String yeniSubeIsmi) {
        // 1- okul numarasini biliyoruz, direk ogrenci value'ye ulasabiliriz

        String ogrenciValue = ogrenciMap.get(okulNo); // Ayse-Can-10-H-MF

        String[] valueArr = ogrenciValue.split("-"); // [Ayse, Can, 10, H, MF]

        // 2- sube ismini guncelleyelim

        valueArr[3] = yeniSubeIsmi; //  [Ayse, Can, 10, M, MF]

        // 3- array'deki guncel bilgileri yeniden value formatinda bir String yapalim

        String yeniValue = valueArr[0] + "-" + valueArr[1] + "-" + valueArr[2] + "-" +
                valueArr[3] + "-" + valueArr[4];

        // 4- ogrenci no yani key ile yeni value'yu map'e ekleyelim

        ogrenciMap.put(okulNo, yeniValue);

        return ogrenciMap;
    }

    public static void sinifListesiyYazdirma(Map<Integer, String> ogrenciMap, String sinif) {
        //verilen siniftaki ogrencilerin no,isim,soyisim , bolumlerini
        //bir liste olarak yazdiran bir method olusturun

        System.out.println("No Isim Soyisim bolum");
        System.out.println("=====================");

        Set<Map.Entry<Integer, String>> entrySeti = ogrenciMap.entrySet();

        for (Map.Entry<Integer, String> eachEntry : entrySeti
        ) {//101=Ali-Can-11-H-MF

            //1-entry den value yu alalim
            String entryValue = eachEntry.getValue(); //Ali-Can-11-H-MF

            //2-bu value yu parcalayalim ve bir array a store edelim

            String[] valueArr = entryValue.split("-"); //[ALi, Can,11,H,MF]

            //sinif bilgisini kontrol edip
            //istenen sinif ile ayni ise istenen bilgileri yazdiralim

            if (valueArr[2].equalsIgnoreCase(sinif)) {
                System.out.println(eachEntry.getKey() + " " +
                        valueArr[0] + " " +
                        valueArr[1] + " " +
                        valueArr[3] + " ");
            }

        }


    }

    public static void bolumlistesiolusturma(Map<Integer, String> ogrenciMap, String bolum) {

        //verilen bolumdeki ogrencilerin
        //no, isim soyisim ve siniflarini yazdiran
        //bir method olusturun

        System.out.println("No Isim Soyisim sinif");
        System.out.println("=====================");

        Set<Map.Entry<Integer, String>> entriseti = ogrenciMap.entrySet();

        for (Map.Entry<Integer, String> eachentry : entriseti
        ) {

            String entryvalue = eachentry.getValue();
            String[] entryvaluearr = entryvalue.split("-");
            if (entryvaluearr[4].equalsIgnoreCase(bolum)) {
                System.out.println(eachentry.getKey() + " " +
                        entryvaluearr[0] + " " +
                        entryvaluearr[1] + " " +
                        entryvaluearr[2] + " ");
            }

        }
    }

    public static Map<Integer, String> soyisimleriBuyukHarfYap(Map<Integer, String> ogrenciMap) {

        //1-entrySet olusturalim
        Set<Map.Entry<Integer, String>> entrySeti = ogrenciMap.entrySet();
        //2-for each loop ile her bir entry i elden gecirip soyisimleri buyuk harf yapalim

        for (Map.Entry<Integer, String> eachentry : entrySeti) {

            //3-entry den value alalim
            String entryValue = eachentry.getValue();

            //4-soyisim bilgisine ulasip degistirebilmek icin parcala
            String[] entryValueArr = entryValue.split("-");

            //5-soyismi buyuk harf yapalim
            entryValueArr[1] = entryValueArr[1].toUpperCase();

            //6-degisikligi yaptiktan sonra yeniden birlestirmeler yapip map i update etmeliyiz

            //7-setvalue() kullanarak value yu yeni haline update edlim
            eachentry.setValue(entryValueArr[0] + "-" +
                    entryValueArr[1] + "-" +
                    entryValueArr[2] + "-" +
                    entryValueArr[3] + "-" +
                    entryValueArr[4] + "-");

        }
        return ogrenciMap;


    }

    public static void tumListeYazdir(Map<Integer, String> ogrencimap) {

        Set<Map.Entry<Integer, String>> ogrenciEntrySet = ogrencimap.entrySet();
        System.out.println("No      Ogrenci Bilgileri");
        System.out.println("======================");

        for (Map.Entry<Integer, String> eachEntry : ogrenciEntrySet
        ) {
            System.out.println(eachEntry);


        }
    }

    public static Map<Integer, String> siniflariArtir(Map<Integer, String> ogrenciMap) {

        // map'de istedigimiz degisikligi yaptiktan sonra
        // map'i update etmenin en kolay yolu setEntry()

        Set<Map.Entry<Integer, String>> entrySeti = ogrenciMap.entrySet();

        for (Map.Entry<Integer, String> eachEntry : entrySeti) { // 101=Ali-Can-11-H-MF

            String entryValue = eachEntry.getValue(); // Ali-Can-11-H-MF

            String[] entryValueArr = entryValue.split("-"); // [Ali, CAN, 11, H, MF]

            int sinifInt = Integer.parseInt(entryValueArr[2]);

            if (sinifInt == 12) {

                entryValueArr[2] = "Mezun";
            } else {

                entryValueArr[2] = sinifInt + 1 + "";
            }

            // sinif bilgisini guncelledik
            // bu guncellemeyi map'e islememiz lazim

            eachEntry.setValue(entryValueArr[0] + "-" +
                    entryValueArr[1] + "-" +
                    entryValueArr[2] + "-" +
                    entryValueArr[3] + "-" +
                    entryValueArr[4]);

        }
        return ogrenciMap;
    }


    public static void sinifSiraliListeYazdir(Map<Integer, String> ogrencimap) {

        Set<Map.Entry<Integer, String>> entrySeti = ogrencimap.entrySet();
        Set<String> siraliOgrenciSeti = new TreeSet<>();

        //tum ogrenci listesini
        //sinif sube isim soyisim no seklinde
        //kucukten dogal sirali olarak
        //yazdiran bir method olusturun

        for (Map.Entry<Integer, String> eachEntry : entrySeti) {

            String entryValue = eachEntry.getValue();

            String[] entryValueArr = entryValue.split("-");

            String istenenFormattakiBilgi = entryValueArr[2] + " " +
                    entryValueArr[3] + " " +
                    entryValueArr[0] + " " +
                    entryValueArr[1] + " " +
                    eachEntry.getKey();


            siraliOgrenciSeti.add(istenenFormattakiBilgi);

        }
        System.out.println("sinif sube isim soyisim no ");
        System.out.println("==========================");

        for (String each : siraliOgrenciSeti) {
            System.out.println(each);
        }
    }

    public static void isimSoyisimSiraliListeYazdir(Map<Integer, String> ogrenciMap) {

        Set<Map.Entry<Integer, String>> entriseti= ogrenciMap.entrySet();
        
        //tum ogrenci listesini isim soyisim no sinif sube bolum 
        Set<String> isimSoyisimSiraliSet=new TreeSet<>();
        for (Map.Entry<Integer, String> eachEntry : entriseti) {

            String value=eachEntry.getValue();

            String[] valuearr=value.split("-");

            String istenenFormattakiBilgi=  valuearr[0]+" "+
                                            valuearr[1]+" "+
                                            eachEntry.getKey()+" "+
                                            valuearr[2]+" "+
                                            valuearr[3]+" "+
                                            valuearr[4];

            isimSoyisimSiraliSet.add(istenenFormattakiBilgi);

        }
        System.out.println("isim soyisim no sinif sube bolum" );
        System.out.println("================================");

        for (String each:isimSoyisimSiraliSet
             ) {
            System.out.println(each);

        }


    }
}