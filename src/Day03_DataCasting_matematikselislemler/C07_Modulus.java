package Day03_DataCasting_matematikselislemler;

public class C07_Modulus {
    public static void main(String[] args) {
        //% Modulus : java da bolme islemi sonucunda kalan islemi verir

        System.out.println(15%4); //3

        System.out.println(45%4); //1 (44 de 4 11 kez kalan 1 Modulus bu sonucu verir

        // Kullanicinin girdigi deger cift sayi ?
        // girilenSayi %2 isleminin sonucu 0 ise cift sayidir

        // kulalnicinin girdigi sayi 7 nin kati mi ?
        // girilen sayi %7 isleminin sonucu 0 ise 7 nin katidir

        // kullanicinin girdigi sayinin birler basamagi
        //kullanicinin 3426 girdi

        int girilensayi=3426;
        int birlerBasamagi=girilensayi%10; //6
        System.out.println("birlerBasamagi :" +birlerBasamagi);
         girilensayi=girilensayi/10;
        System.out.println(girilensayi); //342

        birlerBasamagi=girilensayi%10;
        System.out.println("birlerBasamagi :" +birlerBasamagi);
        girilensayi=girilensayi/10;
        System.out.println(girilensayi); //342

        birlerBasamagi=girilensayi%10;
        System.out.println("birlerBasamagi :" +birlerBasamagi);
        girilensayi=girilensayi/10;
        System.out.println(girilensayi); //342

        birlerBasamagi=girilensayi%10;
        System.out.println("birlerBasamagi :" +birlerBasamagi);
        girilensayi=girilensayi/10;
        System.out.println(girilensayi); //342
    }
}
