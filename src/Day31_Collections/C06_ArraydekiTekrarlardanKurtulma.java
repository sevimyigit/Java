package Day31_Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C06_ArraydekiTekrarlardanKurtulma {
    public static void main(String[] args) {

        //verilen bir arraydeki tekrar eden elementleri
        //sadece bir kere yazarak array'i kisaltan kod yazin

        int[] arr={1,2,4,2,3,5,6,2,4,5,1,2,4,5,3,2,5,6,1,2,5,4,3};

        Set<Integer> arrset=new HashSet<>();

        //array deki tum elementleri Set e ekleyelim

        for (int each:arr
             ) {
         arrset.add(each);
        }

        System.out.println(arrset); // [1, 2, 3, 4, 5, 6]

        //Set' deki element sayisina esit bir array olusturup
        //Set ' deki elementleri oraya tasiyalim

        arr=new int[arrset.size()]; //[0,0,0,0,0,0]

        int index=0;
        for (int each:arrset
             ) {
            arr[index]=each;
            index++;
        }

        System.out.println("Array'in son hali : " + Arrays.toString(arr)); // Array'in son hali : [1, 2, 3, 4, 5, 6]

    }
}
