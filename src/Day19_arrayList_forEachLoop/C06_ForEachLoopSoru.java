package Day19_arrayList_forEachLoop;

public class C06_ForEachLoopSoru {
    public static void main(String[] args) {

        //Soru 4- Kullanicidan bir cumle ve bir harf alin,
        // harf cumlede kullanilmissa kac kere kullanildigini yazdirin,
        // kullanilmadiysa “harf cumlede kullanilmamis” yazdirin

        String cumle="Java ogrenmek cok guzel";
        String harf="e";

        String[] cumlearr=cumle.split("");
        // [J, a, v, a,  , o, g, r, e, n, m, e, k,  , c, o, k,  , g, u, z, e, l]
         int sayac=0;
        for (String eachHarf:cumlearr
             ) {
            if (eachHarf.equals(harf)){
                sayac++;
            }
        }


        if (sayac==0){
            System.out.println("harf cumlede kullanilmamis");
        }else{
            System.out.println(harf+ ", cumlede " + sayac+ " defa kullanilmis");

        }





































    }
}
