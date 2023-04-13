package Day25_Inheritance;

public class DToyata extends CCar{

    DToyata(){
        System.out.println("Parametresiz Toyata Constructor");
    }

    DToyata(String param1){
        System.out.println("Parametreli toyota constructor'i calisti");
    }


    String marka="Toyata";
    String uretimYeri="Toyata farkli ulkelerde uretilir";
}
