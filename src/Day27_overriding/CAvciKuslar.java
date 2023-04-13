package Day27_overriding;

public class CAvciKuslar extends BKuslar {


    protected void hareket( ){
        System.out.println("ucarlar");
    }
    protected void beslenme( ) {
        System.out.println(" et yerler");
    }
    protected void pence( ) {
        System.out.println("pencelidir");
    }
    protected void gaga( ) {
        System.out.println("sivri gagali");
    }

    public static void main(String[] args) {

        CAvciKuslar krt1=new CAvciKuslar();
        krt1.hareket(); // C classindan ucarlar
        krt1.beslenme(); // C Classindan et yerler
        krt1.pence(); // C classindan pencelidir
        krt1.gaga(); //C classindan sivri
        krt1.kanat(); //B classindan kanatlidirlar
        krt1.solunum(); // B classindan akcigerle nefes alirlar
        krt1.cogalma(); //B yumurtayla cogalirlar
        krt1.omur(); //A classindan yasar ve olurler

        // Eger constructor ile data turu ayni ise
        // ozelligin variable veya method olmasina bakilmaksizin
        // o class'a gidilir, o class veya parent class'larda
        // bulunan ILK DEGER kullanilir

        BKuslar krt2=new CAvciKuslar();
        krt2.hareket(); // C classindan ucarlar
        krt2.beslenme(); // C Classindan et yerler
        // krt2.pence(); // BKuslar veya parent class da yok CTE verir
        krt2.gaga(); //C classindan sivri gagalidir
        krt2.kanat(); //B classindan kanatlidirlar
        krt2.solunum(); // B classindan akcigerle nefes alirlar
        krt2.cogalma(); //B yumurtayla cogalirlar
        krt2.omur(); //A classindan yasar ve olurler

        AHayvanlar krt3= new CAvciKuslar();

        krt3.hareket(); // c  ucarlar
        krt3.beslenme(); // c  et yerler
        //krt3.pence(); // AHayvanlar'da yok, CTE
        //krt3.gaga(); // AHayvanlar'da yok, CTE
        //krt3.kanat(); // AHayvanlar'da yok, CTE
        krt3.solunum(); // b akcigerle nefes alirlar
        krt3.cogalma(); // b yumurtayla cogalirlar
        krt3.omur(); // a yasar ve olurler


    }
}
