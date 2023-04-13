package Day34_Maps_NestedMaps;

import java.util.Map;
import java.util.TreeMap;

public class C04_Compute {
    public static void main(String[] args) {

        //verilen bir string array de her bir sayinin kacar defa kullanildigini yazdirin
        //ornek:String[] arr= {"A","C","B","N","A","N","A"}
        //output= A=3 B=1 C=1 N=2

        String[] arr= {"A","C","B","N","A","N","A"};

        //1. yontem
        Map<String,Integer> harfsayilari=new TreeMap<>();

        for (int i = 0; i <arr.length; i++) {

            if (!harfsayilari.containsKey(arr[i])){
                harfsayilari.put(arr[i],1);
            }else {

                Integer eskikullanimmiktari=harfsayilari.get(arr[i]);
                harfsayilari.put(arr[i],eskikullanimmiktari+1);
            }

        }

        System.out.println(harfsayilari); //{A=3, B=1, C=1, N=2}

        // 2.yontem compute

        Map<String,Integer> harfSayilari2= new TreeMap<>();
        for (int i = 0; i < arr.length ; i++) {

            harfSayilari2.computeIfPresent(arr[i], (k,v) -> v+1);
            harfSayilari2.computeIfAbsent(arr[i] ,v -> 1);

        }

        System.out.println(harfSayilari2);
        //{A=3, B=1, C=1, N=2}

    }
}
