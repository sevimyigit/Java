package Day14_WhileLoop_Scope;

public class Hastane {

    static String hastaneismi="Yildiz Hastanesi ";
    static String hastaneAdres="Cankaya/Ankara";
           String personalIsmi;
           String personalAdresi;
           String personalTel;


    public static void main(String[] args) {
        Hastane p1=new Hastane();
        p1.personalIsmi="Kemal";

        Hastane p3=new Hastane();
        p3.personalTel="321321321";

    }
}
