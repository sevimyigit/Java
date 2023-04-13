package Day10_stringManipulation;

public class C01_NullPointer {
    public static void main(String[] args) {

        String str1="";
        String str2="    ";
        String str3;
        String str4=null;

        System.out.println(str1.length());//0
        System.out.println(str2.length()); //4
        System.out.println(str1.isEmpty()); //true
        System.out.println(str2.isEmpty()); // false

        System.out.println(str1.isBlank()); //true
        System.out.println(str2.isBlank());// true

        //null bir deger degil isaretcidir (null-pointer )
        //null-pointer : non primitive bir objenin olusturuldugunu
        //               ancak bilincli olarak deger atanmadigini isaretler
        //               str4 un degeri null'dir cumlesi YANLIS ,
        //               STR4 null olarak isaretlenmis cumlesi DOGRU

        //System.out.println(str3.length()); // hata verir cunku deger atanmadi
       // System.out.println(str3.concat("Ali Can")); //hata verir cunku deger atanmadi
       // System.out.println(str3.substring(3,4)); //hata verir cunku deger atanmadi
        /*
          Java bir varyable i olusturup deger atanmamasina izin verir
          bir varyable i degr atamadan olusturabilirsiniz Ancak kullanamazsiniz
          deger atanmayan bir variable i kullanmaya kalkarsaniz Java CTE verir

          null pointer ise bu variable a  bir deger atanmadigini
          ve bunun bilincli bir tercih oldugunu Java ya soyler
          dolayisiyla Java kodlarin calismaya devam etmesine izin verir
          Ancak deger atanmadigi icin mothodlarla kullanmaya calisirsaniz
           verir


         */

       // System.out.println(str4.length()); //NullPointerException ,yazimi kullanmamiza izin verir ancak yazdirmaz
       // System.out.println(str4.concat("Ali Can")); //NullPointerException,yazimi kullanmamiza izin verir ancak yazdirmaz
      //  System.out.println(str4.substring(3, 4)); //NullPointerException,yazimi kullanmamiza izin verir ancak yazdirmaz
        System.out.println(str4); //null
        System.out.println(str4+ "Ali Can"); //nullAli can
        System.out.println(str4.concat("Ali Can")); //NullPointerException
    }
}
