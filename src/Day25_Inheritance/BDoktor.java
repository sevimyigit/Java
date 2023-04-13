package Day25_Inheritance;

public class BDoktor extends APersonal {

    /*olusturdugumuz doktor class inda isim,soyisim gibi
    personal calss inda olusturulan tum ozelliklerin olmasini istiyoruz
    Bu durumda iki tercih var
         1-istenen tum ozellikleri Doktor class inda yeniden olusturabilirsiniz
        2-Doktor class ini Personal in chil'i yapmak

    Doktor classini personal class inin child i yaptigimizda
    Doktor class indan olusturulan objeler sadece kendi class larindaki
    ozelliklere sahip olmaz ayni zamanda parent class i olan personal deki
    ozelliklere de sahip olurlar

    Bir child class'dan obje olusturdugumuzda
        o objenin ozelliklerini belirlerken
        once kendi class'ina bakilir ve o ozellik varsa kullanilir
        eger kendi class'inda yoksa parent class'a bakilir
        Bir class extends keyword kullanarak baska bir class'i
        kendisine parent edinirse
        1- parent class'daki tum ozellikleri direk kullanabilir
            (isim,soyisim,telefon,ozelSgorta)
        2- Isterse parent class'da olan bir ozelligi kendisine uyarlayabilir
            (maas)
        3- Isterse parent class'da olmayan kendisine ozel yeni ozellikler olusturabilir
            (nobet)


    */

    public static void main(String[] args) {

        BDoktor dok1=new BDoktor();
        dok1.isim="Kemal";
        dok1.soyisim="Bulut";

        System.out.println(dok1.isim+ ","+dok1.soyisim+","+dok1.telefon);
      //  Kemal,Bulut,Telefon Atanmadi
       dok1.maas();
       //Doktor maasi 30 * 8 * 25 : 6000
       dok1.ozelSigorta();
      // Tum Personelin ozel saglik sigortasi yaptirilir
        dok1.nobet();
        //doktorlar haftada bir gun nobet tutar
    }
    public void maas(){
        System.out.println("Doktor maasi 30 * 8 * 25 :"  + 6000);

    }
    public void nobet(){
        System.out.println("doktorlar haftada bir gun nobet tutar");    }

}

