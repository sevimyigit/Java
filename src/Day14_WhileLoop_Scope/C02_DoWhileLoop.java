package Day14_WhileLoop_Scope;

public class C02_DoWhileLoop {
    public static void main(String[] args) {

        // verilen baslangic ve bitis karakterleri dahil aradaki tum karakteri yazdirin

        char baslangic='d';
        char bitis='n';

        do{
            System.out.print(baslangic+ " ");
            baslangic=(char)(baslangic+1);


        } while (baslangic<=bitis);
    }
}
