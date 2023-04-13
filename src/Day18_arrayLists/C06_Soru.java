package Day18_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C06_Soru {
    public static void main(String[] args) {

        //Verilen bir array deki tekrar eden elementleri silip
        //Array i unique degerlerden olusan bir array haline getirin

        int[] arr ={4,3,6,7,3,5,3,6,7,3,5,4,6,4,7,7,7,5};


        List<Integer> benzersizElementlerListesi=new ArrayList<>();

        //array deki tum elementleri
        // alip listede varmi diye kontrol edelim
        //ve olmayanlari ekleyelim

        for (int i = 0; i <arr.length ; i++) {

            if (!benzersizElementlerListesi.contains(arr[i])){

                benzersizElementlerListesi.add(arr[i]);
            }
        }

        System.out.println(benzersizElementlerListesi); //[4, 3, 6, 7, 5]

        //soruda bu degerleri arr'ye atamamiz isteniyor

        arr=new int[benzersizElementlerListesi.size()]; // [0, 0, 0, 0, 0]

        for (int i = 0; i < arr.length ; i++) {

            arr[i] = benzersizElementlerListesi.get(i);

        }
        System.out.println("Array in son hali : " + Arrays.toString(arr)); //Array in son hali : [4, 3, 6, 7, 5]
    }
}
