package Day24_StringBuilder;

import Day14_WhileLoop_Scope.Hastane;

public class C02_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder("Java");

        System.out.println(sb.capacity()); // 20
        System.out.println(sb.length()); //4

        sb.trimToSize();
        //atama yapmadigimiz halde bu degisiklik kalici olur mu ?
        //StringBuilder mutable oldugundan methodlara yapialan degisiklikler kalici olur

        System.out.println(sb.capacity()); //4

        System.out.println(sb.toString().toUpperCase());
        System.out.println(sb); //Java

        //StingBuilder istingre cevirirseniz veya String dondurecej methodlar kullanirsaniz
        //String in imutable ozelligi devreye girer ve yapilan degisiklikler kalici olmaz
        //Short sayi1=20;
        //Integer sayi2=sayi1;
        //nonprimitive data turlerinde farkli data turunden atama yapamazsiniz

        StringBuilder sb2=new StringBuilder(sb.toString().toUpperCase());
        System.out.println(sb2); //JAVA

        sb=sb2;
        System.out.println(sb); //JAVA

        sb.setCharAt(0,'H');
        System.out.println(sb); //HAVA

        System.out.println(sb.substring(2,3)); //V
        System.out.println(sb); //HAVA

        System.out.println(sb.reverse()); //AVAH
        System.out.println(sb); //AVAH
        System.out.println(sb.insert(1, "H "));
        System.out.println(sb) ; // AH VAH

        String UzunMetin=" ETMEK YOK CALISMAK VAR";

        sb.insert(6,UzunMetin,0,10);
        System.out.println(sb); //AH VAH ETMEK YOK

        System.out.println(sb.indexOf("A", 3)); // 4
        System.out.println(sb.indexOf("VAH")); // 3
        System.out.println(sb.lastIndexOf("VAH")); // 3
        System.out.println(sb.lastIndexOf("E", 9)); // 7
        sb.replace(0,12,"Sorun");
        System.out.println(sb); // Sorun YOK
        sb.delete(5,sb.length()); // Baslangic indexi dahil, Bitis indexi dahil degil
        System.out.println(sb); // Sorun


    }
}
