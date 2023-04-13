package Day03_DataCasting_matematikselislemler;

public class C02_ExpilicitNarrowing {
    public static void main(String[] args) {

        /*8
            Eger gensis kapasiteli bir data turunden dar kapasiteli bir data turune casting yapmak isterseniz
            Java bunu yotomatik yapmaz sizden sorumluluk almamizi bekler . islemin gerceklesmesi icin cast yapmak
            istediginiz degerin onun () icinde cevirmek istediginiz data tipini belirtin

            Expilit narrowing

         */
        double dbl=23.5;
        int sayi=(int)dbl;
        System.out.println(sayi); //23

        byte byt=(byte)sayi; // int cevirmek icin mudahale gerekir

        System.out.println(byt); //23

        sayi=130;
        byt=(byte)sayi; // int daha kapsamli oldugu icin otomatik atama yapmaz () mudahale gerekir

        System.out.println("int byte hali : "+byt); // -126 sebebi ise int between -128 den 127 e kadar 127 den -128 den saymaya baslar

        sayi=256;
        byt=(byte)sayi;

        System.out.println("int 256 in byte hali : "+byt);

        sayi=13000;
        byt=(byte)sayi; // int daha kapsamli oldugu icin otomatik atama yapmaz () mudahale gerekir

        System.out.println("int 13000 un byte hali : "+byt);

       /*  double dbl=23.5;
        int sayi=(int)dbl;
        System.out.println(sayi); //23

        byte byt=(byte)sayi; // int cevirmek icin mudahale gerekir

        System.out.println(byt) */

        int nmr=123456;
        byte numara= (byte) nmr;
        System.out.println(numara); //64




    }}
