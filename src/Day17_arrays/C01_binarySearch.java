package Day17_arrays;

import java.util.Arrays;

public class C01_binarySearch {
    public static void main(String[] args) {

        int [] arr={2,8,4,1,9,3,6};

        System.out.println(Arrays.binarySearch(arr, 2)); //-5

        Arrays.sort(arr); //sonra

        System.out.println(Arrays.binarySearch(arr, 2)); //1

        //Olmayan bir element aradigimizda ne olur ?

        System.out.println(Arrays.binarySearch(arr, 0)); // -1
        System.out.println(Arrays.binarySearch(arr, 5)); // -5
        System.out.println(Arrays.binarySearch(arr, 18));// -8

        /*
         olmayan bir elementi binary seacrh ile aratirsaniz once listede olsaydi kacinci sirada olurdu sorusunun cevabini
         bulur ,olmadigini belirtmek icinde basia (-) isareqti koyar
         */


    }
}
