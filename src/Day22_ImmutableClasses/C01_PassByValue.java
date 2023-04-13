package Day22_ImmutableClasses;

import java.util.ArrayList;
import java.util.List;

public class C01_PassByValue {
    public static void main(String[] args) {

        //verilen bir listte degisiklik yapan iki method olusturun
        //birinci method listin elementlerine yeni deger atayip yazdirsin
        //ikinci method list'e yeni bir list degeri atayip yeni list'e
        //elementler ekleyip yazdirsin
        //her iki methodu cagirdiktan sonra main method daki list i yazdiralim

        List<Integer> sayilar= new ArrayList<>();
        sayilar.add(10);
        sayilar.add(34);
        sayilar.add(45);

        System.out.println(sayilar); //[10,34,45]
        elemanlariDegistir(sayilar);

        System.out.println("1. method call dan sonra sayilar :" + sayilar); //[25, 54, 67]

        yeniListAta(sayilar); // [34, 98, 11]
        System.out.println("ikinci method call dan sonra sayilar: " + sayilar); //[25, 54, 67]
        /*
        Java PassByValue kullanir ,

        PassByValue , methoda gonderilen variable in kendisini degil degerini gondermek demektir .
        Primitive data turleri veya String gonderdigimizde method da yapilan degisiklik method da kalir.
        main method da atama yapilmadikca main methoddaki variable in degeri DEGISMEZ.

        PassbyValue coklu element iceren array ve list gibi yapilar icin de gecerlidir,
        Ancak coklu elementi value olarak methoda gonderemediginden
        array veya list in adresini gonderir.
        Eger methodda elementlere atama yapilirsa main methoddaki elementlerde degismis olur
        Eger list veya array a yeni bir list veya array degeri atanirsa bu atama method da kalir
        main method da ki list veya array DEGISMEZ

        Araba ayni kaldigi muddetce icindekilerin degismesi PassByValue ye aykiri degildir.
         */


    }
    public static void elemanlariDegistir (List<Integer> sayilar){
        sayilar.set(0,25);
        sayilar.set(1,54);
        sayilar.set(2,67);
        System.out.println("elemanlari degistir methodunda list :" + sayilar); //[25, 54, 67]

    }

    public static void yeniListAta(List<Integer>sayilar){
        sayilar=new ArrayList<>();
        sayilar.add(34);
        sayilar.add(98);
        sayilar.add(11);
        System.out.println("Yeni List methodunda sayilar List'in son hali : "+ sayilar);
    }

}
