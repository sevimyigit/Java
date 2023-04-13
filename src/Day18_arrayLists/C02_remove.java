package Day18_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C02_remove {
    public static void main(String[] args) {

        List<String> harfler=new ArrayList<>();

        harfler.add("A");
        harfler.add("Z");
        harfler.add("T");

        harfler.remove("Z"); //true  Z'yi silip ve gorevi tamamladigi icin
        System.out.println(harfler); // [A,T]

        System.out.println(harfler.remove(0)); // 0 inci indexdeki elementi siler ve gorevi tamamlayip silinen
                                                     // elementi bize dondurur
        System.out.println(harfler);//[T]

        List<String> yenilist=new ArrayList<>();
        harfler.add("C");
        harfler.add("O");
        harfler.add("T");

        System.out.println(yenilist.removeAll(harfler)); //true
        //harfler lsitesindeki tum elementleri yeni listeden siler gorevi tamamlarsa true yoksa false doner

        System.out.println(yenilist); //[C,D]

    }
}
