package Day34_Maps_NestedMaps;

import java.util.Map;
import java.util.TreeMap;

public class C05_Compute {
    public static void main(String[] args) {

        Map<String,Integer> harfsayilariMap=new TreeMap<>();
        harfsayilariMap.put("A", 10);
        harfsayilariMap.put("C",15);
        harfsayilariMap.put("D",3);
        harfsayilariMap.put("K",5);

        System.out.println(harfsayilariMap); // {A=10, C=15, D=3, K=5}

        //A nin kullanim miktarini 20 yapin

        harfsayilariMap.put("A",20);

        //C nin kullanim miktarini iki katina cikar

        harfsayilariMap.put("C",harfsayilariMap.get("C")*2);
        System.out.println(harfsayilariMap); // {A=20, C=30, D=3, K=5}

        //D nin miktarini 5 arttiralim

        harfsayilariMap.compute("D",(k,v) -> v+5);
        System.out.println(harfsayilariMap); // {A=20, C=30, D=8, K=5}

        //eger map de T varsa kullanim miktarini 3 eksiltin

        harfsayilariMap.computeIfPresent("T",(k,v)-> v-3);
        System.out.println(harfsayilariMap); // {A=20, C=30, D=8, K=5}

        //K harfi varsa kullanim mik2 eksiltin
        harfsayilariMap.computeIfPresent("K",(a,b)-> b-2);
        System.out.println(harfsayilariMap); // {A=20, C=30, D=8, K=3}

        //T harfi yoksa kullanim miktari 3 olarak ekleyin
        harfsayilariMap.computeIfAbsent("T",v->3);
        System.out.println(harfsayilariMap); // {A=20, C=30, D=8, K=3, T=3}



    }
}
