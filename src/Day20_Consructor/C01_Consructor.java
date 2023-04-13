package Day20_Consructor;

import Day19_arrayList_forEachLoop.Toyota;

public class C01_Consructor {
    public static void main(String[] args) {


        Car car1=new Car();
        Toyota toyota=new Toyota();

        System.out.println(car1);
        //Car{marka='Marka Belirtilmemis', model='Model belirtilmemis', yil=1900, km=0, renk='Renk secilmedi'}

        System.out.println(toyota);
        //Day19_arrayList_forEachLoop.Toyota@68837a77
        //toyata bir obje oldugunden ozelliklerini direk yazdiramayiz referansi yazdirir

        //bir class'dan olusturulan objelerin belirli ozelliklerini kolayca yazdirabilmek icin
        //o class da istenen ozellikleri kapsayan toString() methodu olusturulabilir

        /*
         toString method'undaki yazilanlari istedigimiz sekil ve formata uyarlayabiliriz

         */

        car1.marka="Audi";
        car1.model="A4";
        car1.yil=2020;
        car1.renk="siyah";
        System.out.println(car1);
        //Car{marka='Audi', model='A4', yil=2020, km=0, renk='siyah'}
    }
}
