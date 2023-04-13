package Day24_StringBuilder;

public class C04_AccesModifier {
    String str;

    // Access modifier'i gozlerimizle goremiyorsa
    // default access modifier var demektir
    // Bu class'da default constructor var
    // str'in degeri null (default deger)
    // str'in access modifier'i default access modifier


    public static void main(String[] args) {

        D obj1=new D();

        System.out.println(obj1.isimdefault);// Furkan
        obj1.defaultStaticOlmayanMethod();
        //default access modifer'li static olmayan method calisti

        // baska class'lardaki class uyelerine erisimde
        // access modifier ve static keyword'u dikkate alinmalidir
        // static class uyelerini obje uzerinden kullanmaya gerek yoktur
        // illa da obje uzerinden kullanmak isterseniz
        // clas uyesinin ismini yazmaniz gerekir


        System.out.println(obj1.isimDefaultStatic); //Sevilay
        System.out.println(D.isimDefaultStatic); //Sevilay

        obj1.defaultStaticOlmayanMethod(); //default access modifer'li static olmayan method calisti
        D.defultStaticMethod(); //default access modifer'li static  method calisti
    }
}
