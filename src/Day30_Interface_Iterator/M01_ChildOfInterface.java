package Day30_Interface_Iterator;

public class M01_ChildOfInterface implements I01_Interface,I02_Interface  {

    //Bir class baska bir class'i extends keyword ile parent edinebilir
    // Ancak birden fazla class'i parent EDINEMEZ
    // Interface'ler icin boyle bir sinirlama yoktur
    // Bir class istedigi kadar Interface'i implement edebilir
    public static void main(String[] args) {
        System.out.println(I01_Interface.sayi2);
       //  I01_Interface.sayi2=25;
        // Cannot assign a value to final variable 'sayi2'

        //Interface de olusturulan static veya default olarak isaretlenen methodlarin farki
        //static olana interfaceIsmi.methodIsmi seklinde ulasabilirken
        //Default olana child class'dan olusturulacak obje uzeribden erisilebilir
     I01_Interface.method34();

     M01_ChildOfInterface obj=new M01_ChildOfInterface();
     obj.method44();

    }

    //Eger birden fazla interface implement edilgidinde
    //Ayni isimde method'la farkli interface 'lerde varsa
    //return type ' a bakilir
    //return type ayni ise sorun olmaz , cunku ikisinide implement edebiliriz
    //ancak retunr type lari farkli ise birini tercih ettigimizde digerine CTE verir
    //bu durumda parent interface lere mudahale etmek mumkunse mudahale edilebilir
    //veya bu interface 'lerden birini implement etmekten vazgecebiliriz

    @Override
    public void method1() {


    }

    @Override
    public int method2() {
        return 0;
    }

    @Override
    public String method3() {
        return null;
    }

    @Override
    public void method4() {

    }


    @Override
    public void method5() {

    }

    @Override
    public int method6() {
        return 0;
    }
}
