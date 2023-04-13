package Day13_methodOverloading_Whileloop;

public class C02_MethodOverloading {
    public static void main(String[] args) {

        String str="Java cok guzel";

        System.out.println(str.substring(5)); // cok guzel
        System.out.println(str.substring(3,5));// a

        //Eger sectigimiz isimde birden fazla method varsa buna overloading denir
        //ve ayni isimdekki method'lardan hangisinin calisicagina argument/parametre uyumu karar verir

        toplama(5,6);//11
        toplama(5,3,1); //9
      /* Java ayni klas iicerisinde ayni isim ve ayni parametre sayisi ile iki paremetre olusturmaniza
         izin vermez
         1- ismini degistirebiliriz ancak bur durumda overloading olmaz
           overloading ayni isimde ama farkli isleve sahip methodlar olusturmak demektir
         2- parametre sayisini degistirebiliriz
         3-ayni sayida parametre yapip parametrelerin data turunu deistirebiliriz
           veya farkli data turundeki parametlerin yerini degistirebiliriz

       */

        toplama(6,6); //12
        toplama(4.5,5);//4.55
        toplama(4.5,6.7); //11.2

    }

    public static void toplama(int sayi1 , int sayi2){

        System.out.println("2 tamsayinin toplami :" +(sayi1+sayi2));
    }

    public static void toplama(int sayi1 , int sayi2, int sayi3){
        System.out.println("3 sayinin toplami :"+(sayi1+sayi2+sayi3));
    }

    public static void toplama(double sayi1,int sayi2){

        System.out.println("Double ve IN toplami :" +(sayi1+sayi2));
    }

    public static void toplama(int sayi2 , double sayi1){

        System.out.println("int ve double toplami:" + (sayi2+sayi1));
    }

    public static void toplama(double sayi1, double sayi2){
        System.out.println("double ve double toplami:" + (sayi1+sayi2));
    }


}