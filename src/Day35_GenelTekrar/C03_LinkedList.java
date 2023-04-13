package Day35_GenelTekrar;

import java.util.LinkedList;

public class C03_LinkedList {
    //verilen bir linkedlist de
    //istenen iki indexdeki elementlerin yerlerini degistirin
    public static void main(String[] args) {

    LinkedList<String> isimler=new LinkedList<>();
    isimler.add("Said");
    isimler.add("Huseyin");
    isimler.add("Hasan");
    isimler.add("Sevilay");
    isimler.add("Humeyra");

        System.out.println(isimler);

        //Hasan ile Humeyra nin yerlerini degistirileim
        //buyuk bir listede index bilinmedigini dusunerek cozelim

        String ilkIsim="Hasan";
        String ikinciIsim="Humeyra";

        String temp="";

        temp=ilkIsim;

        int ilkisimindex= isimler.indexOf(ilkIsim);
        int ikinciisimindex=isimler.indexOf(ikinciIsim);

        isimler.set(ilkisimindex,ikinciIsim);
        isimler.set(ikinciisimindex,temp);

        System.out.println(isimler);


    }

}
