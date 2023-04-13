package Day30_Interface_Iterator;

public interface I01_Interface {

    //interfacelerde tum methodlar public ve abstract'dir
    //Interface 'lerde tum variable'lar public,static ve final'dir
    //final oldugundan sonradan deger atamak mumkun olmaz,olusturulurken deger ATANMALIDIR
    //



    int sayi=10;
    public static final String okulismi="Yildiz Koleji";
    public int sayi2=20;
    void method1();
    public int method2();
    abstract String method3();
    public abstract void method4();
    void method5();
    /*
    Bir interface e sonradan bir method eklemek istedigimizde
    o interface i daha once implement eden tum class lar
    yeni eklenen method u implement etmek zorunda olur.
    Java'ya yapilan talepler sonucunda
    Java8 ile birlikte bu konusda bir istisna getirilmistir
    Eger sonradan eklenen method un tum eski class lar tarafindan implement edilme mecburiyeti
    olmasin istiryorsaniz

    yeni olusturdugunuz method'a DEFAULT veya STATIC keyword ekleyip
    body de olusturuyorsaniz
    o zaman bu method un child class'lar tarafindan
    implement MECBURIYETI olmaz

     */

  public default void method44(){
      System.out.println("Interface'deki defult oloarak isaretlenen method calisti");

    }

    public static void method34(){
        System.out.println("Interface'deki defult oloarak isaretlenen method calisti");

    }

}
