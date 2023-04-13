package Day15_Scope_Arrays;

public class C01_Hastane {

    static String hastaneismi="Yildiz Hastanesi ";
    static String hastaneAdres="Cankaya/Ankara";
    String personalIsmi;
    String personalAdresi;
    String personalTel;


    public static void main(String[] args) {
    /*
      Eger tum method'lardan kullanilabilecek variable'lar olusturmak isterseniz bir variab;e'lari class level'da
      olustururuz

      Class level da olusturulacak variablelar icin 2 ihtimal vardir
      1- static variable (Class Variable)
      2-instatic (static olmayan) variable (obje variable)

      Kural1-Static variabler tum objeler icin tek bir deger alir
             Instanse variable'lar her obje icin java tarafindan cogaltilir.
      Kural2- class level variable lara deger atamasakda kullanabiliriz
             bi deger atamasak bile java class level variablelara defult deger atar
             non-premitive==>null (Strig)
             char==> hiclik ''
             boolean ==> false

             Kural3- static olan method'lardan static olmayan variale ve methodlara direk ulasilmaz
                    instace varibale ve static olmayan methodlari static olanlardan kullanmak isterseniz obje uzerinden
                    kullanabilirsiniz

            Kural4- Class da olusturulan instance variable lar ic deger atamasini yapar.
                    yani bir obje ilk olusturuldugunda otomarik olarak instanse variable atama degeri alir
                    deger atamamissa defult deger alir
                    obje olusturulduktan sonra obje uzerinden yapilan atamlar
                    class level daki instance variable degil , java tarasindan olusturulur.

            Kural5- static variable lar tum objeler icin ortaktir.
                    static variable lara tum class dan direk ulasabilir
                    static variable in degeri degisirse tum objeler icin degismis olur


     */
        C01_Hastane per1=new C01_Hastane();

        System.out.println(per1.personalIsmi); //null
        System.out.println(per1.personalTel); //null
        System.out.println(per1.personalAdresi); //null

        per1.personalIsmi="Fidan";
        per1.personalAdresi="Germany";
        per1.personalTel="+4917123423523";

        C01_Hastane per2=new C01_Hastane();
        System.out.println(per2.personalIsmi); // null

        per1.personalIsmi="Yusuf";
        System.out.println(per2.personalIsmi);
        per2.personalIsmi="Ayten";
        System.out.println(per2.personalIsmi); //ayten
        System.out.println(per1.personalIsmi); //yusuf

        System.out.println(hastaneAdres); // Yildiz Hastanesi
        System.out.println(per1.hastaneismi);  // Java Hastanesi

        per2.hastaneismi="Java Hastanesi";
        System.out.println(hastaneismi);

    }
  public static void method1(){
      System.out.println(hastaneAdres);
  }


}
