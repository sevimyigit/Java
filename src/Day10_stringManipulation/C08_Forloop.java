package Day10_stringManipulation;

public class C08_Forloop {
    public static void main(String[] args) {

        /*
          1 ile 1000 arasindaki sayilari yanyana yazdirin
          yazdirma islemi bittiginde
          "tum bu sayilarin toplami= deyip sonucu yazdirin
         */
        int sayilarintoplami=0;

        for (int i = 0; i <=1000 ; i++) {
            System.out.println(i+" ");
            sayilarintoplami+=i;

            System.out.println("");
            System.out.println("tum bu sayilarin toplami : "+sayilarintoplami);

        }
    }
}
