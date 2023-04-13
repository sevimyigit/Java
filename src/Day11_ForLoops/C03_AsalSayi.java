package Day11_ForLoops;

public class C03_AsalSayi {
    public static void main(String[] args) {

        //input olarak verilen bir tam sayinin asal sayi olup olmadigini yazin

        int input=19;
        String sonuc="sayi asal";

        // asal sayi 2 ile bir eksisine bol 20

        for (int i = 2; i <input; i++) {

            if (input%i==0) {
                 sonuc="asal sayi degil";
                break;


                //Java bir loop un icerisinde break gorurse o loop u biterir

            }}
        System.out.println(sonuc);
    }
}
