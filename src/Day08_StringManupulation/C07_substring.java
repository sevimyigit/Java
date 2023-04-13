package Day08_StringManupulation;

public class C07_substring {
    public static void main(String[] args) {

        String str="Java ogren, isi kap";

        System.out.println(str.length()); // karakter sayisi 19
        /*
        Metnin tam ortasindaki karakter nedir ?
         */
        System.out.println(str.charAt(str.length()/2)); // n

        //son karakteri yazdirin ?

        System.out.println(str.charAt(str.length()-1)); //p

        // Bir karakteri degil verilen string'in icerdigi metin parcasini elde etmek istersek
        //ornegin "ogren" kelimesini yazdirin
        System.out.println(str.substring(5, 9)); // ogre
        //substring baslangic bitis methodunda baslangic olarak index inclusive bitis olarak yailan index exclusive
        System.out.println(str.substring(5, 10));

        //"Java" yazdirin
        System.out.println(str.substring(0,4)); // java

        //kap yazdirin
        System.out.println(str.substring(16,19)); // kap
        System.out.println(str.substring(16)); // kap
        System.out.println(str.substring(str.length()-3)); // beginindex

        //substring kullanarak sadece j yazdirin

        System.out.println(str.substring(0)); //Java ogren, isi kap
        System.out.println(str.substring(0,1));

        //substring kullanarak 9. indexteki harfi buyuk olarak yazdirin

        System.out.println(str.substring(9,10).toUpperCase());
        System.out.println(str.toUpperCase().charAt(9));

        // charAt kullanmak yerine substring kullanmak avantajli olabilir
        //cunku substing kullaninca iafe hala sting oldugundan
        //method kullanmaya devam edebiliriz

        System.out.println(str.substring(5,5)); // hiclik yazdirir
        System.out.println(str.substring(4,3)); // hata verir
        //StringIndexOutOfBoundsException: begin 4, end 3, length 19
       System.out.println(str.substring(25,28));
         //StringIndexOutOfBoundsException: begin 25, end 28, length 19
        System.out.println(str.substring(str.length())); // hiclik yazdirir
    }
}
