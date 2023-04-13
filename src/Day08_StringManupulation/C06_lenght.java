package Day08_StringManupulation;

import java.util.Random;

public class C06_lenght {
    public static void main(String[] args) {

        String str="Java her gecen gun daha da guzellesiyor";

        //sondan 3. karakteri yazdirin

        System.out.println(str.charAt(str.length()-3));

        Random rnd= new Random(); // rnd degeri icin 0-1 arasinda rastgale bir deger olusturur
        int index=rnd.nextInt(str.length()); // str length () den kucuk rastgale int verir

        System.out.println(str.charAt(index));

    }
}
