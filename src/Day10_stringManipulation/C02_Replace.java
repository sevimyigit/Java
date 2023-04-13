package Day10_stringManipulation;

public class C02_Replace {
    public static void main(String[] args) {

        String str="Java ogren, adana ye :)";

        System.out.println(str.replace('a', 'A')); //JAvA ogren, AdAnA ye :)

        System.out.println(str.replace(" ","")); //Javaogren,adanaye:)

        System.out.println(str.replace("Java", "yazilim")); //yazilim ogren, adana ye :)

        String telefon="555 3451234";
        System.out.println(telefon.replace("555","532")); //532 3451234

        System.out.println(telefon.replace('3', '7')); //555 7451274

        // asagadaki arama sonucunun 10 binden fazla oldugunu test edin

        String sonuc="1-16 of over 100.000 results for \"apple\"";

        int indexOver=sonuc.indexOf("over");
        int indexResult=sonuc.indexOf("results");

        String sonucsayisiStr=sonuc.substring(indexOver+5, indexResult-1);
        System.out.println(sonucsayisiStr); //100.000

        sonucsayisiStr=sonucsayisiStr.replace(".","");
        System.out.println(sonucsayisiStr); //100000

        int sonucsayisiint=Integer.parseInt(sonucsayisiStr);//string 10000'i int 100000'e cevirir

        if (sonucsayisiint>10000) {
            System.out.println("arama sonuc testi PASSED");
        } else {
            System.out.println("Arama sonuc testi failed");
        }
    }
}
