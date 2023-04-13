package Day12_MethodCreation;

import Day11_ForLoops.C12_MethodCreation;

public class C01_Method {
    public static void main(String[] args) {
        //method'lar bazen cok basit islemleri , bazen complex islemleri yapabilir
        //biz o islemleri nasil yapabiliriz diye dusunmek yerine hazir method'u kullanmayi tercih ederiz.
        //bizden sonra kodu inceleyecek kisiler de hazir method islemlerinden ne yapmak istedigimizi kolayca anlayabilir
        //ayrica kodu her yazdigimizda yapabilecegimiz muhtemel hatalardan kurtulmus oluruz

        String str="Java da yolu yariladik";

        str.isEmpty();
          //Methodun dondurdugu sonuccu kullanmak isterseniz
        //ya yazdiririz
        System.out.println(str.isBlank()); //false

        //ya da donen conucu ileride kullanacaksa atama yapabilitim

        String buyukHarfliHali=str.toUpperCase();

        C12_MethodCreation.faktoryelyazdir(7);




    }
}
