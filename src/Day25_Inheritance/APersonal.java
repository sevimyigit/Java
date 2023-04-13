package Day25_Inheritance;

public class APersonal {

  protected   String isim="isim Atanmadi";
   protected String soyisim="Soyisim Atanmadi";
   protected String telefon="Telefon Atanmadi";
    protected void maas(){
        System.out.println("Hastenemizde uygulanan asgari ucret : " + 1700);
    }

   protected  void ozelSigorta(){
        System.out.println("Tum Personelin ozel saglik sigortasi yaptirilir ");
    }

    private void privateMethod(){
        System.out.println("Private method calisti");
    }
}
