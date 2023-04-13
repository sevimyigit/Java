package Day08_StringManupulation;

public class C05_charAt {
    public static void main(String[] args) {

        String str="java guzeldir"; // 13 karakter barindirir

        /*java'da index 0'dan baslar
         j==0.index , r==>12
         charAt(index) ile istedigimiz indexteki char a ulasabiliriz

        ilk A yi yazdiralim
         */

        System.out.println(str.charAt(1));

        //sondan ikinci harfi yazdiralim
        System.out.println(str.charAt(13-2)); //karakter sayisi -2

        //sondan dorduncu karakteri buyuk harf olarak verin

        System.out.println(str.charAt(13-4));

        //CharAt () methodu bize char dondurdugu icin toUpperCase calismaz
        //String methodlarini charAt() ile kullanmak isterseniz
        //CharAt() once kullanmalisiniz

        System.out.println(str.toUpperCase().charAt(13-4));

        System.out.println(str.charAt(13)); // hata verir syntex acisindan dogru ancak yazdirma acisindan yanlis olur
        // Eger index olarak karakter sayisi veya daha buyuk deger girersek o indexi bulamayacagi icin hata verir
    }
}
