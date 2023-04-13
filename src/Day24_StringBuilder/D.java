package Day24_StringBuilder;

public class D {
    private String isim="Mustafa";
    String isimdefault="Furkan";
    static String isimDefaultStatic="Sevilay";

    public static void main(String[] args) {

       //  System.out.println(isim); static olmadigindan static main method icinde direkt kullanilamaz

        D obj1=new D();
        System.out.println(obj1.isim);

        staticMethod();
        System.out.println(obj1.isim);
    }

    private void staticOlmayanMethod(){
        isim="Huseyin";
        System.out.println(isim);
    }

    void defaultStaticOlmayanMethod(){
        System.out.println("default access modifer'li static olmayan method calisti");
    }
    static void defultStaticMethod(){

        System.out.println("default access modifer'li static  method calisti");
    }

    private static void staticMethod(){
        D obj1=new D();
        obj1.isim="Zafer";
        System.out.println(obj1.isim);
    }
}
