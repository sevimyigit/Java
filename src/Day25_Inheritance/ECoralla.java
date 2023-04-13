package Day25_Inheritance;

public class ECoralla extends DToyata{
    ECoralla(){
        System.out.println("Parametresiz Toyata Consructor");
    }

    ECoralla(String param1){
        super("Gri");
        System.out.println("String parametreli coralla consructor calisti");
    }

    String model="Coralla";
    String uretimYeri="Turkiye";

    public static void main(String[] args) {

      ECoralla cor1=new ECoralla("Mavi");


    }

     /*
        Bir obje olusturuldugunda ilk deger atamasi yapilabilmesi icin
        constructor calismalidir.

        Inheritance'da biliyoruz ki
        chiild class'dan olusturulan her obje
        parent class'daki ozelliklere de sahip olur

        Parent class'daki ozelliklere sahip olabilmesi icin
        parent class'daki constructor'lar da calismalidir.

        Java bu calismayi super() sayesinde saglar
        Java'da her olusturulan class'da gorunmese de default constructor oldugu gibi
        extends keyword kullanilan her class'da olusturulan her constructor'in
        ilk satirinda gorunmese de super() vardir
     */
}
