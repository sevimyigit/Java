package Day21_StaticKeyword;

public class C02_PassByValue {
    public static void main(String[] args) {
        /*
        Java PassByValue kullanir
        yani method lar arasinda gonderilen variable rin
        kendileri degil , value lari methoda yollanir

         */

        int fiyat=100;
        //fiyat uzerinden %10 indirim yapip, indirimli fiyati donduren bir method olusturun

        System.out.println(indirimYap10(fiyat)); // 90
        System.out.println(indirimYap10(fiyat)); // 90
        System.out.println(indirimYap10(fiyat)); // 90
        System.out.println(indirimYap10(fiyat)); // 90  deger degismez atama yapilmadigi icin

        System.out.println(fiyat); //100

        //Eger indirimli fiyatin kalici olarak fiyatimizi degistirmesini istersek atama yapariz
        fiyat=indirimYap10(fiyat);
    }

    public static int indirimYap10(int a){
        a=a*90/100;

        return a;
    }
}
