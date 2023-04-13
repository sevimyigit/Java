package Day26_Inheritance;

import Day18_arrayLists.C10_Soru;

import java.util.ArrayList;
import java.util.List;

public class FDieselCoralla extends ECoralla {

    String motor="1.6 diesel motor";
    String yakit="Diesel";
    String guvenlik="Abs";
    String renk="renk belirtilmedi";

    public static void main(String[] args) {
        DToyata c3=new FDieselCoralla();
        System.out.println(c3.motor); //T "Motor Belirtilmedi"
        System.out.println(c3.yakit); //T "
       // System.out.println(c3.guvenlik); //CTE
      //  System.out.println(c3.renk); //CTE

        System.out.println(c3.model); //T "Model belirtilmedi"
        //System.out.println(c3.uretimYeri);//CTE
        //System.out.println(c3.teker); //CTE

        System.out.println(c3.marka); //T Toyata

        //Bazen child class da obje olusturmakla beraber
        // bu child class in parent class indaki hangi ozelliklerini
        //aldigini bilmek isteriz
        //Bu durumda data turunu consrtuctor i kullanilan class'in
        //parent class larindan secebiliriz

        ECoralla c2=new FDieselCoralla();

        System.out.println(c2.motor); //T Motor belirtilmedi
        System.out.println(c2.yakit); //T yakit belirtilmedi
        // System.out.println(c2.guvenlik); //CTE
       // System.out.println(c2.renk); //CTE

        System.out.println(c2.model); //C Corolla
        System.out.println(c2.uretimYeri);//C Turkiye
        System.out.println(c2.teker); //C 200.55 teker
        System.out.println(c2.vites);

        System.out.println(c2.marka); //T Toyata





        FDieselCoralla c1=new FDieselCoralla();
        System.out.println(c1.motor); //DC 1.6 diesel motor
        System.out.println(c1.yakit); //DC Diesel
        System.out.println(c1.guvenlik); //DC Abs
        System.out.println(c1.renk); //DC renk belirtilmedi

        System.out.println(c1.model); //C Corolla
        System.out.println(c1.uretimYeri);//C Turkiye
        System.out.println(c1.teker); //C 200.55 teker

        System.out.println(c1.marka); //T Toyata

        List<String> Liste=new ArrayList<>();


    }


}
